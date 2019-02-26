/*
 * CSC 422 Spring 2019 - Prj Week 6 JUnitDemo - MathNGTest
 * Created by: Rob Nelson
 * Creation Date: 02/22/19
 * Revision Date: 02/25/19
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

    Below was code I attempted to implement, per our professors asks, and the unscuccessuful atteomt I made is here as well;
    
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
   
}

