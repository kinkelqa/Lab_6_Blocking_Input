import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        boolean userInput = false;

        do {
            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                userInput = true;

                System.out.print("The equivalent temperature in Fahrenheit is: " + fahrenheit + " " );

                if (celsius == 0)
                {
                    System.out.println("This is the freezing point of water.");
                } else if (celsius == 100)
                {
                    System.out.println("This is the boiling point of water.");
                }
            } else
            {
                System.out.println("Invalid user input. Please enter a valid value.");
                in.next();
            }

        } while (!userInput);

        in.close();
    }

}