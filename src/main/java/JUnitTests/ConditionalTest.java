package JUnitTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.condition.JRE;

public class ConditionalTest {

    /**

     * 1.Condition on Operating system
     * 2.Condition on particular JRE

     **/
    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void conditiononWindows()
    {
        System.out.println("Execute this test only in WINDOWS machine");
    }
    @Test
    @EnabledOnJre(JRE.JAVA_19)
    public void conditiononJRE()
    {
        System.out.println("Execute this test only for Java 17");
    }




}
