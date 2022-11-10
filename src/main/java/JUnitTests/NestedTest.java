package JUnitTests;

import JUnitClasses.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {
    Calculator calc;
    @BeforeEach
    public void init()
    {
        calc=new Calculator();
    }
    @Nested
    class addPositiveNumber
    {


        @Test
        public void addsmallPositiveNumbers()
        {
            int sum=calc.add(2,3);
            System.out.println(sum);
        }
        @Test
        public void addbigPositiveNumbers()
        {
            int sum=calc.add(1000,2000);
            System.out.println(sum);
        }


    }
    @Nested
    class addNegativeNumbers
    {


        @Test
        public void addsmallNegativeNumbers()
        {
            int sum=calc.add(-2,-3);
            System.out.println(sum);
        }
        @Test
        public void addbigNegativeNumbers()
        {
            int sum=calc.add(-2000,-3000);
            System.out.println(sum);
        }



    }

    @Nested
    class addZeroNumbers
    {
        @Test
        public void addpositiveZeroNumbers()
        {
            int sum=calc.add(0,0);
            System.out.println(sum);
        }
        @Test
        public void addnegativeZeroNumbers()
        {
            int sum=calc.add(-0,-0);
            System.out.println(sum);
        }



    }












}
