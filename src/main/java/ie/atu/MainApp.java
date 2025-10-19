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

        System.out.println("Please enter the second number: ");
        double secondNumber = scan1.nextDouble();
        System.out.println("You entered " + secondNumber);
        scan1.close();

        Calculator calc1 = new Calculator(firstNumber, secondNumber);
        System.out.println(calc1.getFIRST_NUMBER() + " + " + calc1.getSECOND_NUMBER() + " = " + calc1.add());
        System.out.println(calc1.getFIRST_NUMBER() + " - " + calc1.getSECOND_NUMBER() + " = " + calc1.sub());
        System.out.println(calc1.getFIRST_NUMBER() + " * " + calc1.getSECOND_NUMBER() + " = " + calc1.mul());
        System.out.println(calc1.getFIRST_NUMBER() + " / " + calc1.getSECOND_NUMBER() + " = " + calc1.div());
        System.out.println(calc1.getFIRST_NUMBER() + " ^ " + calc1.getSECOND_NUMBER() + " = " + calc1.pow());
        System.out.println(calc1.getFIRST_NUMBER() + " % " + calc1.getSECOND_NUMBER() + " = " + calc1.mod());
    }
}
