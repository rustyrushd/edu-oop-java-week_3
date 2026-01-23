/*
 * A simple demo calculator app that operates (+, -, *, /) on two numbers.
 * The app reads two numbers and a choice of operation from the user via an object created from the
 * Scanner class.
 * It then prints the result. Some errors are handled.
 *
 * Author: rgm
 *
 * [1.0.1] - 2025-10-15
 *
 */

package ie.uni.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Please enter the first number: ");
    try {
      double firstNumber = scan1.nextDouble();
      System.out.println("You entered " + firstNumber + "\n");

      System.out.println("Would you like to add (\"+\"), subtract (\"-\"), multiply (\"*\"), "
          + "divide (\"/\"), exponent (\"^\") or (\"%\") to modulo these two numbers?");
      String choice = scan1.next();

      System.out.println("\nPlease enter the second number: ");
      double secondNumber = scan1.nextDouble();
      System.out.println("\nYou entered " + secondNumber + "\n");
      scan1.close();

      Calculator calc1 = new Calculator(firstNumber, secondNumber, choice);
      calc1.operation();
    } catch (InputMismatchException e) {
      System.err.println("Invalid input, please try again with a valid number like "
          + "1, 2, 3..." + "🫠");
    } catch (ArithmeticException | IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
    System.out.println("\nThanks for using, have a nice day!");
  }
}
