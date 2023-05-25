package com.calculation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**@Test annotation specifies method is test method
 * @Test(timeout=1000) annotation specifies that method will be failed if do not set resp. in 1000ms than
 * @Before annotation specifies that method will be invoked before each test
 * @After annotation specifies that method will be invoked after each test
 * @BeforClass annotation specifies that method will be invoked only once, before starting the test
 * @AfterClass annotation specifies that method will be invoked once, after finishing all the tests*/
public class CalculationTest {

    @BeforeClass
    public static void tearUp(){
        System.out.println("Before class");
    }
    @Test
    public void TestFindMax(){
        System.out.println("test case find max");
        assertEquals(4, Calculation.findMaxArray(new int[]{1,3,4,2}));
        assertEquals(-1, Calculation.findMaxArray(new int[]{-1,-3,-2}));
    }

    @Test
    public void TestFindCube(){
        System.out.println("test case cube");
        assertEquals(8,Calculation.findCube(2));
        assertEquals(27,Calculation.findCube(3));
        assertEquals(125,Calculation.findCube(5));
    }

    @Test
    public void TestFindRevWord(){
        System.out.println("test case reverse word");
        assertEquals("anas",Calculation.findReverseWord("sana"));
        assertEquals("cba", Calculation.findReverseWord("abc"));
        assertEquals("gniniar sti", Calculation.findReverseWord("its raining"));
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("after class");
    }
}
