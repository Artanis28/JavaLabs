package StringCalculator;

public class StringCalculator
{
    public int add(String numbers) throws IllegalArgumentException
    {
        if(numbers.length() == 0)
        {
            return 0;
        }

        numbers = numbers.replace('\n', ',');
        if(numbers.contains(",,"))
        {
            throw new IllegalArgumentException("Two delimiters standing nearby");
        }

        String[] nums = numbers.split(",");

        int sum = 0;
        for(String num : nums)
        {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}