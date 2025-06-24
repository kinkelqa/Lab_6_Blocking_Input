import java.util.Scanner;

import java.util.Random;

    public class HighorLow
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            Random rand = new Random();

            int randomNumber = rand.nextInt(10) + 1;
            int userGuess = 0;
            boolean userInput = false;

            do
            {
                System.out.print("Guess a number between 1 and 10: ");
                if (in.hasNextInt())
                {
                    userGuess = in.nextInt();
                    if (userGuess >= 1 && userGuess <= 10)
                    {
                        userInput = true;
                    } else
                    {
                        System.out.println("Please enter a number between 1 and 10.");
                    }
                } else
                {
                    System.out.println("Invalid input. Please enter an integer.");
                    in.next();
                }
            } while (!userInput);

            System.out.println("The random number was: " + randomNumber);

            if (userGuess == randomNumber)
            {
                System.out.println("On the money!");
            }
            else if (userGuess < randomNumber)
            {
                System.out.println("Too low!");
            }
            else
            {
                System.out.println("Too high!");
            }
            in.close();
        }
    }

