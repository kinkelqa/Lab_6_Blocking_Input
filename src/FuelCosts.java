import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        double gallonsInTank = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;
        boolean userInput = false;


        do
        {
            System.out.print("Enter number of gallons of gas in the tank: ");
            if (in.hasNextDouble())
            {
                gallonsInTank = in.nextDouble();
                if (gallonsInTank > 0)
                {
                    userInput = true;
                }
                else
                {
                    System.out.println("Value must be greater than 0.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid value.");
                in.next();
            }
        }
        while (!userInput);

        userInput = false;

        do
        {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                if (fuelEfficiency > 0)
                {
                    userInput = true;
                }
                else
                {
                    System.out.println("Fuel efficiency must be greater than 0.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid value.");
                in.next();
            }
        } while (!userInput);

        userInput = false;

        do
        {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                if (pricePerGallon > 0)
                {
                    userInput = true;
                }
                else
                {
                    System.out.println("Price must be greater than 0.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid value.");
                in.next();
            }
        }
        while (!userInput);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double maxDistance = gallonsInTank * fuelEfficiency;

        System.out.print("Cost to drive 100 miles: " + costPer100Miles + " ");
        System.out.printf("Maximum distance with a full tank: " +maxDistance + " ");

        in.close();
    }
}