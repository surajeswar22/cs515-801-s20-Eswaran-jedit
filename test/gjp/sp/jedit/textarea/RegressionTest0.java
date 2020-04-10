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
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ToolTipText" + "'", str0, "ToolTipText");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = org.gjt.sp.jedit.textarea.TextArea.NORMAL_SCROLL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = org.gjt.sp.jedit.textarea.TextArea.ELECTRIC_SCROLL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int0 = org.gjt.sp.jedit.textarea.TextArea.NO_SCROLL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Locale locale0 = null;
        javax.swing.JComponent.setDefaultLocale(locale0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int int0 = javax.swing.JComponent.UNDEFINED_CONDITION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) 'a', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass4 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass3 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 0, 64, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 0, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) ' ', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) 'a', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 128, 2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (-1), 16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) '4', 128, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        java.lang.Class<?> wildcardClass1 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) 'a', 2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) -1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass2 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 64, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) -1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (-1), (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) 'a', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) '#', 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 0, 128, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) ' ', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) ' ', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 32, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass6 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 128, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) -1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) ' ', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass5 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) '#', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 100, 16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass7 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) -1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 1, 128, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 0, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (-1), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) -1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) '4', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (-1), (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (-1), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) ' ', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (-1), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass9 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (byte) 1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 2, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, 4, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) 'a', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        javax.swing.JPopupMenu jPopupMenu0 = null;
        java.awt.Component component1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.textarea.TextArea.showPopupMenu(jPopupMenu0, component1, (int) (short) 1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

