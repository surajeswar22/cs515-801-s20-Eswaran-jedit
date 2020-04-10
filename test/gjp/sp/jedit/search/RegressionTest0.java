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
        int int0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
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
        java.lang.String str0 = org.gjt.sp.jedit.search.HyperSearchResults.NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hypersearch-results" + "'", str0, "hypersearch-results");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.gjt.sp.jedit.View view0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.search.HyperSearchResults hyperSearchResults1 = new org.gjt.sp.jedit.search.HyperSearchResults(view0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = org.gjt.sp.jedit.search.HyperSearchResults.M_OPEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Locale locale0 = null;
        javax.swing.JComponent.setDefaultLocale(locale0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int0 = org.gjt.sp.jedit.search.HyperSearchResults.M_OPEN_NEW_PLAIN_VIEW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int0 = org.gjt.sp.jedit.search.HyperSearchResults.M_OPEN_NEW_VIEW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        javax.swing.tree.DefaultMutableTreeNode defaultMutableTreeNode0 = null;
        org.gjt.sp.jedit.search.HyperSearchTreeNodeCallback hyperSearchTreeNodeCallback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.gjt.sp.jedit.search.HyperSearchResults.traverseNodes(defaultMutableTreeNode0, hyperSearchTreeNodeCallback1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ToolTipText" + "'", str0, "ToolTipText");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int int0 = org.gjt.sp.jedit.search.HyperSearchResults.M_OPEN_NEW_SPLIT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.gjt.sp.jedit.search.HyperSearchResults hyperSearchResults0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.gjt.sp.jedit.search.HyperSearchResults.ActionHandler actionHandler1 = hyperSearchResults0.new ActionHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.gjt.sp.jedit.search.HyperSearchResults$ActionHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.String str0 = org.gjt.sp.jedit.search.HyperSearchResults.HIGHLIGHT_PROP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hypersearch.results.highlight" + "'", str0, "hypersearch.results.highlight");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        java.lang.Class<?> wildcardClass1 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int0 = javax.swing.JComponent.UNDEFINED_CONDITION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass2 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass3 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass8 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
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
        java.lang.Class<?> wildcardClass10 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass11 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass13 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass14 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass12 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass16 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass15 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass18 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass17 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass19 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass21 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass20 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass22 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass23 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass27 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass25 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass24 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass26 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass28 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass28);
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass29 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass31 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass33 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass34 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass30 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass30);
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
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
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
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
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        java.lang.Class<?> wildcardClass35 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }
}

