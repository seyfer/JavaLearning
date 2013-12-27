/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seed.seyfer.Lynda2011.SwitchMonth;

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
public class MonthLoopsTest {

    public MonthLoopsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of withFor method, of class MonthLoops.
     */
    @Test
    public void testWithFor() {
        System.out.println("withFor");
        MonthLoops instance = new MonthLoops();
        instance.withFor();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of withWhile method, of class MonthLoops.
     */
    @Test
    public void testWithWhile() {
        System.out.println("withWhile");
        MonthLoops instance = new MonthLoops();
        instance.withWhile();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonths method, of class MonthLoops.
     */
    @Test
    public void testGetMonths() {
        System.out.println("getMonths");
        MonthLoops instance = new MonthLoops();
        String[] expResult = {"1"};
        String[] _month = {"1"};
        instance.setMonths(_month);
        String[] result = instance.getMonths();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonths method, of class MonthLoops.
     */
    @Test
    public void testSetMonths() {
        System.out.println("setMonths");
        String[] _months = null;
        MonthLoops instance = new MonthLoops();
        instance.setMonths(_months);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
