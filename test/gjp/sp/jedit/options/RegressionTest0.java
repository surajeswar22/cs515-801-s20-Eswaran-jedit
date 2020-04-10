import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ToolTipText" + "'", str0, "ToolTipText");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.Locale locale0 = null;
        javax.swing.JComponent.setDefaultLocale(locale0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.awt.Component component0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = javax.swing.JComponent.isLightweightComponent(component0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.awt.event.KeyListener keyListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            component7.removeKeyListener(keyListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        java.awt.Graphics graphics1 = null;
        gutterOptionPane0.paint(graphics1);
        boolean boolean3 = gutterOptionPane0.isPreferredSizeSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.lang.String str8 = gutterOptionPane0.getUIClassID();
        java.awt.Point point9 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutterOptionPane0.setLocation(point9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PanelUI" + "'", str8, "PanelUI");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        int int5 = gutterOptionPane0.getWidth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        gutterOptionPane0.setFocusTraversalPolicyProvider(false);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.lang.String str8 = gutterOptionPane0.getUIClassID();
        java.awt.Component component11 = gutterOptionPane0.locate((int) (short) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            component11.transferFocus();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PanelUI" + "'", str8, "PanelUI");
        org.junit.Assert.assertNull(component11);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.lang.String str8 = gutterOptionPane0.getUIClassID();
        java.awt.Component component11 = gutterOptionPane0.locate((int) (short) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            gutterOptionPane0.addSeparator("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PanelUI" + "'", str8, "PanelUI");
        org.junit.Assert.assertNull(component11);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.dnd.DropTarget dropTarget2 = null;
        gutterOptionPane0.setDropTarget(dropTarget2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point9 = gutterOptionPane0.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        gutterOptionPane0.firePropertyChange("hi!", '#', '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        gutterOptionPane0.addNotify();
        java.awt.Font font10 = gutterOptionPane0.getFont();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        java.awt.Graphics graphics1 = null;
        gutterOptionPane0.paint(graphics1);
        javax.accessibility.AccessibleContext accessibleContext3 = gutterOptionPane0.getAccessibleContext();
        org.junit.Assert.assertNotNull(accessibleContext3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        boolean boolean9 = gutterOptionPane0.isPreferredSizeSet();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        boolean boolean8 = gutterOptionPane0.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseExit(event2, (int) (short) 0, 100);
        javax.swing.TransferHandler transferHandler6 = gutterOptionPane0.getTransferHandler();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transferHandler6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        gutterOptionPane0.addNotify();
        java.awt.Component component10 = gutterOptionPane0.getNextFocusableComponent();
        int int11 = gutterOptionPane0.getX();
        // The following exception was thrown during execution in test generation
        try {
            gutterOptionPane0.init();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.awt.Insets insets8 = null;
        java.awt.Insets insets9 = gutterOptionPane0.getInsets(insets8);
        java.awt.Event event10 = null;
        boolean boolean12 = gutterOptionPane0.keyUp(event10, (int) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.event.ComponentListener componentListener2 = null;
        gutterOptionPane0.addComponentListener(componentListener2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.lang.String str8 = gutterOptionPane0.getUIClassID();
        java.awt.Component component11 = gutterOptionPane0.locate((int) (short) 0, 4);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            component11.removePropertyChangeListener("", propertyChangeListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PanelUI" + "'", str8, "PanelUI");
        org.junit.Assert.assertNull(component11);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.event.ContainerListener[] containerListenerArray5 = gutterOptionPane0.getContainerListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(containerListenerArray5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.awt.Insets insets8 = null;
        java.awt.Insets insets9 = gutterOptionPane0.getInsets(insets8);
        boolean boolean10 = gutterOptionPane0.isManagingFocus();
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane11 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float12 = gutterOptionPane11.getAlignmentY();
        java.awt.MenuComponent menuComponent13 = null;
        gutterOptionPane11.remove(menuComponent13);
        java.awt.Container container15 = gutterOptionPane11.getTopLevelAncestor();
        java.awt.Component component18 = gutterOptionPane11.getComponentAt((int) '#', 32);
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane19 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float20 = gutterOptionPane19.getAlignmentY();
        java.awt.Event event21 = null;
        boolean boolean24 = gutterOptionPane19.mouseDrag(event21, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        gutterOptionPane19.removePropertyChangeListener("hi!", propertyChangeListener26);
        java.awt.LayoutManager layoutManager28 = gutterOptionPane19.getLayout();
        // The following exception was thrown during execution in test generation
        try {
            gutterOptionPane0.addComponent(component18, (java.awt.Component) gutterOptionPane19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNull(container15);
        org.junit.Assert.assertNull(component18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(layoutManager28);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.lang.String str8 = gutterOptionPane0.getUIClassID();
        java.awt.Component component11 = gutterOptionPane0.locate((int) (short) 0, 4);
        gutterOptionPane0.setInheritsPopupMenu(true);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PanelUI" + "'", str8, "PanelUI");
        org.junit.Assert.assertNull(component11);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        java.util.Locale locale9 = gutterOptionPane0.getLocale();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.lang.String str8 = gutterOptionPane0.getUIClassID();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        gutterOptionPane0.addPropertyChangeListener("", propertyChangeListener10);
        int int12 = gutterOptionPane0.countComponents();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PanelUI" + "'", str8, "PanelUI");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension5 = gutterOptionPane0.getMinimumSize();
        gutterOptionPane0.setRequestFocusEnabled(true);
        gutterOptionPane0.setFocusTraversalPolicyProvider(true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        gutterOptionPane0.addPropertyChangeListener("ToolTipText", propertyChangeListener11);
        javax.swing.InputVerifier inputVerifier13 = null;
        gutterOptionPane0.setInputVerifier(inputVerifier13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(dimension5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        gutterOptionPane0.addNotify();
        java.awt.Component component10 = gutterOptionPane0.getNextFocusableComponent();
        java.awt.Point point12 = gutterOptionPane0.getMousePosition(false);
        int int13 = gutterOptionPane0.getHeight();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        java.awt.Graphics graphics1 = null;
        gutterOptionPane0.paint(graphics1);
        gutterOptionPane0.setFocusTraversalPolicyProvider(true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension5 = gutterOptionPane0.getMinimumSize();
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane6 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float7 = gutterOptionPane6.getAlignmentY();
        java.awt.Event event8 = null;
        boolean boolean11 = gutterOptionPane6.mouseDrag(event8, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        gutterOptionPane6.removePropertyChangeListener("hi!", propertyChangeListener13);
        java.awt.LayoutManager layoutManager15 = gutterOptionPane6.getLayout();
        gutterOptionPane0.setLayout(layoutManager15);
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane17 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float18 = gutterOptionPane17.getAlignmentY();
        java.awt.MenuComponent menuComponent19 = null;
        gutterOptionPane17.remove(menuComponent19);
        java.awt.Container container21 = gutterOptionPane17.getTopLevelAncestor();
        java.awt.Component component24 = gutterOptionPane17.getComponentAt((int) '#', 32);
        java.awt.Insets insets25 = null;
        java.awt.Insets insets26 = gutterOptionPane17.getInsets(insets25);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray27 = gutterOptionPane17.getMouseMotionListeners();
        boolean boolean28 = gutterOptionPane0.isAncestorOf((java.awt.Component) gutterOptionPane17);
        java.awt.Component[] componentArray29 = gutterOptionPane0.getComponents();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(layoutManager15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(container21);
        org.junit.Assert.assertNull(component24);
        org.junit.Assert.assertNotNull(insets26);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(componentArray29);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension5 = gutterOptionPane0.getMinimumSize();
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane6 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float7 = gutterOptionPane6.getAlignmentY();
        java.awt.Event event8 = null;
        boolean boolean11 = gutterOptionPane6.mouseDrag(event8, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        gutterOptionPane6.removePropertyChangeListener("hi!", propertyChangeListener13);
        java.awt.LayoutManager layoutManager15 = gutterOptionPane6.getLayout();
        gutterOptionPane0.setLayout(layoutManager15);
        java.awt.Point point17 = null;
        java.awt.Point point18 = gutterOptionPane0.getLocation(point17);
        int int19 = gutterOptionPane0.getWidth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(layoutManager15);
        org.junit.Assert.assertNotNull(point18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        java.awt.Graphics graphics1 = null;
        gutterOptionPane0.paint(graphics1);
        java.awt.event.HierarchyListener hierarchyListener3 = null;
        gutterOptionPane0.removeHierarchyListener(hierarchyListener3);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension5 = gutterOptionPane0.getMinimumSize();
        gutterOptionPane0.setRequestFocusEnabled(true);
        java.awt.Event event8 = null;
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane9 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean10 = gutterOptionPane9.isFocusCycleRoot();
        java.awt.Event event11 = null;
        boolean boolean14 = gutterOptionPane9.mouseExit(event11, (int) (short) 0, 100);
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        gutterOptionPane9.removeInputMethodListener(inputMethodListener15);
        boolean boolean17 = gutterOptionPane0.action(event8, (java.lang.Object) inputMethodListener15);
        javax.swing.KeyStroke keyStroke18 = null;
        int int19 = gutterOptionPane0.getConditionForKeyStroke(keyStroke18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane9 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean10 = gutterOptionPane9.isFocusCycleRoot();
        java.awt.Component component13 = gutterOptionPane9.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension14 = gutterOptionPane9.getMinimumSize();
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane15 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float16 = gutterOptionPane15.getAlignmentY();
        java.awt.Event event17 = null;
        boolean boolean20 = gutterOptionPane15.mouseDrag(event17, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        gutterOptionPane15.removePropertyChangeListener("hi!", propertyChangeListener22);
        java.awt.LayoutManager layoutManager24 = gutterOptionPane15.getLayout();
        gutterOptionPane9.setLayout(layoutManager24);
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane26 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float27 = gutterOptionPane26.getAlignmentY();
        java.awt.MenuComponent menuComponent28 = null;
        gutterOptionPane26.remove(menuComponent28);
        java.awt.Container container30 = gutterOptionPane26.getTopLevelAncestor();
        java.awt.Component component33 = gutterOptionPane26.getComponentAt((int) '#', 32);
        java.awt.Insets insets34 = null;
        java.awt.Insets insets35 = gutterOptionPane26.getInsets(insets34);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray36 = gutterOptionPane26.getMouseMotionListeners();
        boolean boolean37 = gutterOptionPane9.isAncestorOf((java.awt.Component) gutterOptionPane26);
        java.awt.Image image38 = null;
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane41 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float42 = gutterOptionPane41.getAlignmentY();
        java.awt.Event event43 = null;
        boolean boolean46 = gutterOptionPane41.mouseDrag(event43, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        gutterOptionPane41.removePropertyChangeListener("hi!", propertyChangeListener48);
        boolean boolean50 = gutterOptionPane41.isOptimizedDrawingEnabled();
        boolean boolean51 = gutterOptionPane9.prepareImage(image38, (int) (short) 100, 4, (java.awt.image.ImageObserver) gutterOptionPane41);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component53 = gutterOptionPane0.add((java.awt.Component) gutterOptionPane41, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(component13);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(layoutManager24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNull(container30);
        org.junit.Assert.assertNull(component33);
        org.junit.Assert.assertNotNull(insets35);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.5f + "'", float42 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.awt.Insets insets8 = null;
        java.awt.Insets insets9 = gutterOptionPane0.getInsets(insets8);
        boolean boolean10 = gutterOptionPane0.isManagingFocus();
        boolean boolean11 = gutterOptionPane0.isDisplayable();
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane12 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float13 = gutterOptionPane12.getAlignmentY();
        java.awt.MenuComponent menuComponent14 = null;
        gutterOptionPane12.remove(menuComponent14);
        java.awt.Container container16 = gutterOptionPane12.getTopLevelAncestor();
        java.awt.Component component19 = gutterOptionPane12.getComponentAt((int) '#', 32);
        java.awt.Insets insets20 = null;
        java.awt.Insets insets21 = gutterOptionPane12.getInsets(insets20);
        java.awt.Insets insets22 = gutterOptionPane0.getInsets(insets21);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNull(container16);
        org.junit.Assert.assertNull(component19);
        org.junit.Assert.assertNotNull(insets21);
        org.junit.Assert.assertNotNull(insets22);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        gutterOptionPane0.addNotify();
        boolean boolean10 = gutterOptionPane0.isPaintingForPrint();
        gutterOptionPane0.firePropertyChange("ToolTipText", (short) (byte) 10, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            gutterOptionPane0._init();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension5 = gutterOptionPane0.getMinimumSize();
        gutterOptionPane0.setRequestFocusEnabled(true);
        java.awt.Event event8 = null;
        boolean boolean11 = gutterOptionPane0.mouseEnter(event8, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        gutterOptionPane0.addNotify();
        java.awt.Component component10 = gutterOptionPane0.getNextFocusableComponent();
        java.awt.Point point12 = gutterOptionPane0.getMousePosition(false);
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane13 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean14 = gutterOptionPane13.isFocusCycleRoot();
        java.awt.Component component17 = gutterOptionPane13.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension18 = gutterOptionPane13.getMinimumSize();
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane19 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float20 = gutterOptionPane19.getAlignmentY();
        java.awt.Event event21 = null;
        boolean boolean24 = gutterOptionPane19.mouseDrag(event21, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        gutterOptionPane19.removePropertyChangeListener("hi!", propertyChangeListener26);
        java.awt.LayoutManager layoutManager28 = gutterOptionPane19.getLayout();
        gutterOptionPane13.setLayout(layoutManager28);
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane30 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float31 = gutterOptionPane30.getAlignmentY();
        java.awt.MenuComponent menuComponent32 = null;
        gutterOptionPane30.remove(menuComponent32);
        java.awt.Container container34 = gutterOptionPane30.getTopLevelAncestor();
        java.awt.Component component37 = gutterOptionPane30.getComponentAt((int) '#', 32);
        java.awt.Insets insets38 = null;
        java.awt.Insets insets39 = gutterOptionPane30.getInsets(insets38);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray40 = gutterOptionPane30.getMouseMotionListeners();
        boolean boolean41 = gutterOptionPane13.isAncestorOf((java.awt.Component) gutterOptionPane30);
        java.awt.Image image42 = null;
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane45 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float46 = gutterOptionPane45.getAlignmentY();
        java.awt.Event event47 = null;
        boolean boolean50 = gutterOptionPane45.mouseDrag(event47, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        gutterOptionPane45.removePropertyChangeListener("hi!", propertyChangeListener52);
        boolean boolean54 = gutterOptionPane45.isOptimizedDrawingEnabled();
        boolean boolean55 = gutterOptionPane13.prepareImage(image42, (int) (short) 100, 4, (java.awt.image.ImageObserver) gutterOptionPane45);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component57 = gutterOptionPane0.add((java.awt.Component) gutterOptionPane13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(layoutManager28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertNull(container34);
        org.junit.Assert.assertNull(component37);
        org.junit.Assert.assertNotNull(insets39);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.5f + "'", float46 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension5 = gutterOptionPane0.getMinimumSize();
        gutterOptionPane0.setRequestFocusEnabled(true);
        gutterOptionPane0.setFocusTraversalPolicyProvider(true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        gutterOptionPane0.addPropertyChangeListener("ToolTipText", propertyChangeListener11);
        gutterOptionPane0.setFocusTraversalKeysEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(dimension5);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension5 = gutterOptionPane0.getMinimumSize();
        gutterOptionPane0.setRequestFocusEnabled(true);
        gutterOptionPane0.setFocusTraversalPolicyProvider(true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        gutterOptionPane0.addPropertyChangeListener("ToolTipText", propertyChangeListener11);
        java.awt.LayoutManager layoutManager13 = gutterOptionPane0.getLayout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(layoutManager13);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        boolean boolean2 = gutterOptionPane0.isOpaque();
        boolean boolean3 = gutterOptionPane0.isFocusOwner();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        java.awt.Container container4 = gutterOptionPane0.getTopLevelAncestor();
        java.awt.Component component7 = gutterOptionPane0.getComponentAt((int) '#', 32);
        java.awt.Insets insets8 = null;
        java.awt.Insets insets9 = gutterOptionPane0.getInsets(insets8);
        java.awt.Color color10 = null;
        gutterOptionPane0.setForeground(color10);
        gutterOptionPane0.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertNotNull(insets9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        boolean boolean1 = gutterOptionPane0.isFocusCycleRoot();
        java.awt.Component component4 = gutterOptionPane0.getComponentAt((int) (byte) 1, 1);
        java.awt.Dimension dimension5 = gutterOptionPane0.getMinimumSize();
        gutterOptionPane0.setToolTipText("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertNotNull(dimension5);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        gutterOptionPane0.addNotify();
        boolean boolean10 = gutterOptionPane0.isPaintingForPrint();
        gutterOptionPane0.firePropertyChange("ToolTipText", (short) (byte) 10, (short) 1);
        gutterOptionPane0.transferFocus();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.MenuComponent menuComponent2 = null;
        gutterOptionPane0.remove(menuComponent2);
        boolean boolean4 = gutterOptionPane0.isRequestFocusEnabled();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        gutterOptionPane0.addNotify();
        boolean boolean10 = gutterOptionPane0.isPaintingForPrint();
        gutterOptionPane0.firePropertyChange("ToolTipText", (short) (byte) 10, (short) 1);
        java.awt.event.KeyListener[] keyListenerArray15 = gutterOptionPane0.getKeyListeners();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(keyListenerArray15);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.gjt.sp.jedit.options.GutterOptionPane gutterOptionPane0 = new org.gjt.sp.jedit.options.GutterOptionPane();
        float float1 = gutterOptionPane0.getAlignmentY();
        java.awt.Event event2 = null;
        boolean boolean5 = gutterOptionPane0.mouseDrag(event2, (int) '#', (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        gutterOptionPane0.removePropertyChangeListener("hi!", propertyChangeListener7);
        gutterOptionPane0.addNotify();
        boolean boolean10 = gutterOptionPane0.isPaintingForPrint();
        gutterOptionPane0.firePropertyChange("", (double) (short) 0, 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        gutterOptionPane0.removePropertyChangeListener(propertyChangeListener15);
        java.awt.dnd.DropTarget dropTarget17 = gutterOptionPane0.getDropTarget();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dropTarget17);
    }
}

