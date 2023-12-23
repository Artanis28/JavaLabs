package StringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator
{
    public int add(String numbers) throws IllegalArgumentException
    {
        if(numbers.length() == 0)
        {
            return 0;
        }

        numbers = replaceDelimitersWithComma(numbers);
        if(numbers.contains(",,"))
        {
            throw new IllegalArgumentException("Two delimiters standing nearby");
        }

        String[] nums = numbers.split(",");

        checkForNegativeNumbers(nums);

        int sum = 0;
        for(String num : nums)
        {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    private String replaceDelimitersWithComma(String str)
    {
        if(str.startsWith("//"))
        {
            char customDelimiter = str.charAt(2);
            return str.replace('\n', ',').replace(customDelimiter, ',').substring(4);
        }

        return str.replace('\n', ',');
    }

    private void checkForNegativeNumbers(String[] numbers) throws IllegalArgumentException
    {
        List<Integer> negativeNumbers = new ArrayList<>();
        for(String number : numbers)
        {
            int num = Integer.parseInt(number);

            if(num < 0)
            {
                negativeNumbers.add(num);
            }
        }

        if(!negativeNumbers.isEmpty())
        {
            throw new IllegalArgumentException("Unsupported negative numbers. %s were passed".formatted(negativeNumbers.toString()));
        }
    }
}