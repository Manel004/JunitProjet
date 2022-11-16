package JUnitTests;

import JUnitClasses.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    Calculator calc;

    @BeforeEach
    public void init()
    {
        calc=new Calculator();
    }
    @Test

    public void assertEqualsTest()
    {
        int sum=calc.add(2,3);
        Assertions.assertEquals(5,sum,"Tests failed as expected value is not equal to actual value");
    }
    @Test
    public void assertNotEqualsTest()
    {
        int sum=calc.add(2,3);
        Assertions.assertNotEquals(6,sum,"Test failed");

    }

    @Test
    public void assertArrayEqualsTest()
    {
        Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
    }

    @Test
    public void assertNullTest()
    {
        String nullString=null;
        String notnullString="junit";
        //Assertions.assertNull(nullString);
        Assertions.assertNotNull(notnullString);
    }

    @Test
    public void assertTrueTest()
    {
        boolean truevalue=true;
        boolean falsevalue=false;
        Assertions.assertTrue(truevalue);
    }

    @Test
    public void assertFalseTest()
    {
        boolean truevalue=true;
        boolean falsevalue=false;
        Assertions.assertFalse(falsevalue);
    }


}
