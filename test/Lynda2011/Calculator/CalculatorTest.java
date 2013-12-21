/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lynda2011.Calculator;

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
public class CalculatorTest {

    public CalculatorTest()
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
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        double expResult = 0.0;
        double result = Calculator.main(args);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addMultipleValues method, of class Calculator.
     */
    @Test
    public void testAddMultipleValues()
    {
        System.out.println("addMultipleValues");
        double[] values = null;
        double expResult = 0.0;
        double result = Calculator.addMultipleValues(values);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
