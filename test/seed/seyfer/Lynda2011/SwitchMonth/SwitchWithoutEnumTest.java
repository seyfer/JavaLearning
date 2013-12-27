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
public class SwitchWithoutEnumTest {

    public SwitchWithoutEnumTest() {
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
     * Test of doSwitch method, of class SwitchWithoutEnum.
     */
    @Test
    public void testDoSwitch() {
        System.out.println("doSwitch");
        double monthNum = 0.0;
        SwitchWithoutEnum instance = new SwitchWithoutEnum();
        instance.doSwitch(monthNum);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
