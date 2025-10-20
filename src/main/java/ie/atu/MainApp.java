package ie.atu;

import java.util.Scanner;

public class MainApp
{
	public static void main(String[] args)
	{
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double firstNumber = scan1.nextDouble();
        System.out.println("You entered " + firstNumber);

        System.out.println("Would you like to add (\"+\"), subtract (\"-\"), multiply (\"*\"), " +
                "divide (\"/\"), exponent (\"^\") or (\"%\") to modulo these two numbers?");
        String choice = scan1.next();

        System.out.println("Please enter the second number: ");
        double secondNumber = scan1.nextDouble();
        System.out.println("You entered " + secondNumber);
        scan1.close();

        Calculator calc1 = new Calculator(firstNumber, secondNumber, choice);
        calc1.operation();

        System.out.println("\nThanks for using, have a nice day!");
    }
}
