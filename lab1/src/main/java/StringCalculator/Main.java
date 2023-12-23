package StringCalculator;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            StringCalculator stringCalculator = new StringCalculator();
            System.out.println(stringCalculator.add("1,2"));
        }
        catch (Error e)
        {
            System.out.println(e.getMessage());
            System.out.println("String length must not be greater than 2");
        }
    }
}