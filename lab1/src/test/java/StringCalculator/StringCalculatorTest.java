package StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest
{
    private static final StringCalculator calculator = new StringCalculator();

    @Test
    void emptyString()
    {
        int common = calculator.add("");
        Assertions.assertEquals(0, common);
    }

    @Test
    void singleNumber()
    {
        int common = calculator.add("8");
        Assertions.assertEquals(8, common);
    }

    @Test
    void addTwoNumbersWithCommaDelimiter()
    {
        int common = calculator.add("1,3");
        Assertions.assertEquals(4, common);
    }

    @Test
    void addThreeNumbersWithTwoDelimiters()
    {
        int common = calculator.add("3,8\n52");
        Assertions.assertEquals(63, common);
    }

    @Test
    void throwIllegalArgumentExceptionIfDelimiterStandingNearbyAnotherDelimiter()
    {
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.add("2,22\n,52"));
        Assertions.assertEquals("There are two delimiters standing nearby", e.getMessage(), () -> "Exception message doesn't match expected one");
    }

    @Test
    void testCustomDelimiter()
    {
        int common = calculator.add("//;\n1;2");
        Assertions.assertEquals(3, common);
    }

    @Test
    void testCustomDelimiterWithDefaultDelimiters()
    {
        int common = calculator.add("//+\n1+2,4\n1\n2");
        Assertions.assertEquals(10, common);
    }
}