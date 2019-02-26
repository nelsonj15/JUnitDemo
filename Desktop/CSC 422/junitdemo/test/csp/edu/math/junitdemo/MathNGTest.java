/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csp.edu.math.junitdemo;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MathNGTest {
    
    public MathNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of add method, of class Math.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int n = 0;
        int m = 0;
        Math instance = new Math();
        int expResult = 0;
        int result = instance.add(n, m);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /*
    
    everytime I added this below or any other exaplmes of what you had presented in the week 5 lecture I continued to get this error
    ""non-static method add(int,int) cannot be referenced from static context. I'm at a total loss."
    When I added this @Test I keep getting 
    
        @Test public void  testSomeMethod() {
                    assertEquals(-10, Math.add(-4, -6));
                    assertEquals(0, Math.add(-4, 4));
                    assertEquals(0, Math.add(4, -4));
                    assertEquals(-10, Math.add(4, 6));
    }
 */
}

