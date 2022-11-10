package JUnitTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;


public class RepeatedTestMethod {

    @Test
    @org.junit.jupiter.api.RepeatedTest(4)
    public void repeatedTestMethod1()
    {
        System.out.println("I am executing this test multiple times");
    }

    @Test
    @org.junit.jupiter.api.RepeatedTest(value=2, name="{displayName}   -   {currentRepetition}/{totalRepetitions}")
    public void repeatedTestMethod2()
    {
        System.out.println("I am executing this test multiple times");
    }

    @Test
    @org.junit.jupiter.api.RepeatedTest(value=4, name= org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME)
    public void repeatedTestMethod3()
    {
        System.out.println("I am executing this test multiple times");
    }


    @Test
    @org.junit.jupiter.api.RepeatedTest(value=4, name=org.junit.jupiter.api.RepeatedTest.SHORT_DISPLAY_NAME)
    public void repeatedTestMethod4()
    {
        System.out.println("I am executing this test multiple times");
    }



}
