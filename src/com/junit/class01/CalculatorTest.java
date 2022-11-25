package com.junit.class01;


//Test case for div
// 1. a=1, b=2, expected = 0
// 2. a=10, b=10, expected = 1
// 3. a= 10, b=0, expected = Exception
// 4. a=0, b=10, expected = 0
// 5. a=20, b=10, expected = 2
// 6. a=-20, b=10, expected = -2
// 7. a=-20, b=-10, expected = 2
// 8. a=20, b=-10, expected= -2
// 9. a=0, b=0, expected = Exception
// 10. a=5, b=1, expected = 5
// a=10000, b=2500, expected=4

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    // Annotations - that is special symbol to tell java

    @Test
    public void verifyFirstNumberGreaterThanSecondNumber1() {
        int expectedResults = 0;
        int a = 10, b = 5;
        int actualResult = c.div(b, a);
        //System.out.println(expectedResults == actualResult);
        String message = "Expected = " + expectedResults+ " : Actual= " + actualResult;
        Assert.assertTrue(message, expectedResults==actualResult);

    }
    @Test
    public void verifyWhenBothNumbersAreEquals2() {
        int expectedResults = 1;
        int a = 10, b = 10;
        int actualResult = c.div(b, a);
        //System.out.println(expectedResults == actualResult);
        String message = "Expected = " + expectedResults+ " : Actual= " + actualResult;
        Assert.assertTrue(message, expectedResults==actualResult);

    }
    @Test
    public void verifyFirstNumberGreaterThanSecondNumber5() {
        int expectedResults = 2;
        int a = 10, b = 5;
        int actualResult = c.div(b, a);
        //System.out.println(expectedResults == actualResult);
        String message = "Expected = " + expectedResults+ " : Actual= " + actualResult;
        Assert.assertTrue(message, expectedResults==actualResult);

    }

}
