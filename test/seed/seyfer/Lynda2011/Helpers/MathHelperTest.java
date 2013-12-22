/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seed.seyfer.Lynda2011.Helpers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seyfer
 */
public class MathHelperTest {

    public MathHelperTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of add method, of class MathHelper.
     */
    @Test
    public void testAdd()
    {
        System.out.println("add");
        double d1 = 0.0;
        double d2 = 0.0;
        double expResult = 0.0;
        double result = MathHelper.add(d1, d2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class MathHelper.
     */
    @Test
    public void testSubstract()
    {
        System.out.println("substract");
        double d1 = 0.0;
        double d2 = 0.0;
        double expResult = 0.0;
        double result = MathHelper.substract(d1, d2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class MathHelper.
     */
    @Test
    public void testDivide()
    {
        System.out.println("divide");
        double d1 = 0.0;
        double d2 = 0.0;
        double expResult = 0.0;
        double result = MathHelper.divide(d1, d2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of multyply method, of class MathHelper.
     */
    @Test
    public void testMultyply()
    {
        System.out.println("multyply");
        double d1 = 0.0;
        double d2 = 0.0;
        double expResult = 0.0;
        double result = MathHelper.multyply(d1, d2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
