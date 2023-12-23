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
}