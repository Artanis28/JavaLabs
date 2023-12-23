package StringCalculator;

public class StringCalculator
{
    public int add(String numbers)
    {
        if(numbers.length() == 0)
        {
            return 0;
        }

        String[] nums = numbers.split(",");

        if(nums.length > 2)
        {
            throw new Error();
        }

        int sum = 0;
        for(String num : nums)
        {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}