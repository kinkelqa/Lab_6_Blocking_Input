import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        double width = 0.0;
        double height = 0.0;
        boolean userInput = false;

        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                if (width > 0)
                {
                    userInput = true;
                } else
                {
                    System.out.println("Width must be greater than 0.");
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
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                if (height > 0)
                {
                    userInput = true;
                }
                else
                {
                    System.out.println("Height must be greater than 0.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid value.");
                in.next();
            }
        }
        while (!userInput);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.print ("Area of the rectangle: " +area + " ");
        System.out.print ("Perimeter of the rectangle: " +perimeter + " ");
        System.out.print ("Length of the diagonal: " +diagonal + " ");

        in.close();
    }
}