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

package org.gjt.sp.jedit.options;

import org.gjt.sp.jedit.ServiceManager;
import org.gjt.sp.jedit.jEdit;
import org.gjt.sp.jedit.textarea.JEditTextArea;

import javax.swing.*;
import java.io.Serializable;

public class GutterOptionPaneProduct implements Serializable {
    private JComboBox<String> foldPainter;
    private String[] painters;

    public JComboBox<String> getFoldPainter() {
        return foldPainter;
    }

    public String[] getPainters() {
        return painters;
    }//{{{ addFoldStyleChooser() method

    public void addFoldStyleChooser(GutterOptionPane gutterOptionPane) {
        painters = ServiceManager.getServiceNames(JEditTextArea.FOLD_PAINTER_SERVICE);
        foldPainter = new JComboBox<String>();
        String current = JEditTextArea.getFoldPainterName();
        int selected = 0;
        for (int i = 0; i < painters.length; i++) {
            String painter = painters[i];
            foldPainter.addItem(jEdit.getProperty(
                    "options.gutter.foldStyleNames." + painter, painter));
            if (painter.equals(current))
                selected = i;
        }
        foldPainter.setSelectedIndex(selected);
        gutterOptionPane.addComponent(new JLabel(jEdit.getProperty("options.gutter.foldStyle.label")), foldPainter);
    } //}}}
}