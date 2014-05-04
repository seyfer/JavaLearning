/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seed.seyfer.Lynda2011.Calculator;

import org.junit.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

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
        double result = 0;
        try {
            result = Calculator.main(args);
        }
        catch (Exception ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
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
    }

}
