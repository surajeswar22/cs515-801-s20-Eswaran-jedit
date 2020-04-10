/*
 * jEdit - Programmer's Text Editor
 * :tabSize=8:indentSize=8:noTabs=false:
 * :folding=explicit:collapseFolds=1:
 *
 * Copyright © 2020 jEdit contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.gjt.sp.jedit.search;

import org.gjt.sp.jedit.GUIUtilities;
import org.gjt.sp.jedit.gui.RolloverButton;
import org.gjt.sp.jedit.jEdit;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.io.Serializable;

public class HyperSearchResultsProduct implements Serializable {
    private final JLabel caption;
    private final DefaultMutableTreeNode resultTreeRoot;
    private final DefaultTreeModel resultTreeModel;
    private final RolloverButton stop;
    private JTree resultTree;

    public HyperSearchResultsProduct() {
        caption = new JLabel();
        stop = new RolloverButton(GUIUtilities.loadIcon(
                jEdit.getProperty("hypersearch-results.stop.icon")));
        resultTreeRoot = new DefaultMutableTreeNode();
        resultTreeModel = new DefaultTreeModel(resultTreeRoot);
    }

    public JLabel getCaption() {
        return caption;
    }

    public DefaultMutableTreeNode getResultTreeRoot() {
        return resultTreeRoot;
    }

    public DefaultTreeModel getResultTreeModel() {
        return resultTreeModel;
    }

    public RolloverButton getStop() {
        return stop;
    }//{{{ setSearchStatus() method

    public void setSearchStatus(String status) {
        caption.setText(status);
    } //}}}

    //{{{ searchStarted() method
    public void searchStarted() {
        stop.setEnabled(true);
        caption.setText(jEdit.getProperty("hypersearch-results.searching",
                new String[]{trimSearchString()}));
    } //}}}

    private String trimSearchString() {
        String s = SearchAndReplace.getSearchString();
        int length = jEdit.getIntegerProperty("hypersearch.displayQueryLength", 100);
        if (s.length() > length) {
            return s.substring(0, length) + "...";
        }
        return s;
    }

    //{{{ searchFailed() method
    public void searchFailed(JTree thisResultTree) {
        caption.setText(jEdit.getProperty("hypersearch-results.no-results",
                new String[]{trimSearchString()}));

        // collapse all nodes, as suggested on user mailing list...
        for (int i = 0; i < resultTreeRoot.getChildCount(); i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                    resultTreeRoot.getChildAt(i);
            thisResultTree.collapsePath(new TreePath(new Object[]{
                    resultTreeRoot, node}));
        }
    } //}}}

    /**
     * @param searchNode the result node
     * @param selectNode the node that must be selected, or null
     * @since jEdit 4.3pre12
     */
    public void searchDone(final DefaultMutableTreeNode searchNode, final DefaultMutableTreeNode selectNode, boolean thisMultiStatus, JTree thisResultTree) {
        stop.setEnabled(false);
        final int nodeCount = searchNode.getChildCount();
        if (nodeCount < 1) {
            searchFailed();
            return;
        }

        caption.setText(jEdit.getProperty("hypersearch-results.done",
                new String[]{trimSearchString()}));

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (!thisMultiStatus) {
                    for (int i = 0; i < resultTreeRoot.getChildCount(); i++) {
                        resultTreeRoot.remove(0);
                    }
                }

                resultTreeRoot.add(searchNode);
                resultTreeModel.reload(resultTreeRoot);


                for (int i = 0; i < nodeCount; i++) {
                    TreePath lastNode = new TreePath(
                            ((DefaultMutableTreeNode)
                                    searchNode.getChildAt(i))
                                    .getPath());

                    thisResultTree.expandPath(lastNode);
                }
                TreePath treePath;
                if (selectNode == null) {
                    treePath = new TreePath(new Object[]{
                            resultTreeRoot, searchNode});
                } else {
                    treePath = new TreePath(selectNode.getPath());
                }
                thisResultTree.setSelectionPath(treePath);
                thisResultTree.scrollPathToVisible(
                        treePath);
            }
        });
    } //}}}

    private void searchFailed() {
        HyperSearchResultsProduct hyperSearchResultsProduct = null;
        hyperSearchResultsProduct.searchFailed(this.resultTree);
    }
}