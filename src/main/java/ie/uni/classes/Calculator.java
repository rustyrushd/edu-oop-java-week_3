package ie.uni.classes;

public class Calculator {
  private final double FIRST_NUMBER;
  private final double SECOND_NUMBER;
  private final String USER_CHOICE;

  public Calculator(double firstNum, double secondNum, String userChoice) {
    this.FIRST_NUMBER = firstNum;
    this.SECOND_NUMBER = secondNum;
    this.USER_CHOICE = userChoice;
  }

  public double getFIRST_NUMBER() {
    return FIRST_NUMBER;
  }

  public double getSECOND_NUMBER() {
    return SECOND_NUMBER;
  }

  public String getUSER_CHOICE() {
    return USER_CHOICE;
  }

  // selects operation for two passed numbers and prints result
  void operation() {
    String result = switch (getUSER_CHOICE()) {
      case "+" -> Double.toString(add());
      case "-" -> Double.toString(sub());
      case "*" -> Double.toString(mul());
      case "/" -> {
        if (getSECOND_NUMBER() == 0) {
          throw new ArithmeticException("Division by zero: To infinity and beyond, "
              + "as the second number = 0! " + "🚀");
        } else {
          yield Double.toString(div());
        }
      }
      case "^" -> Double.toString(pow());
      case "%" -> Double.toString(mod());
      default -> {
        result = "🤷";
        System.err.println("Your expression:\n" + getFIRST_NUMBER() + " " + getUSER_CHOICE()
            + " " + getSECOND_NUMBER() + " = " + result);
        throw new IllegalArgumentException("Invalid operation selected, please type \"+\" to add, "
            + "\"-\" to subtract, \"*\" to multiply, \"/\" to divide, (\"^\") to exponent or " +
            "(\"%\") to modulo next time.");
      }
    };
    System.out.println(getFIRST_NUMBER() + " " + getUSER_CHOICE() + " " + getSECOND_NUMBER()
        + " = " + result);
  }

  double add() {
    return getFIRST_NUMBER() + getSECOND_NUMBER();
  }

  double sub() {
    return getFIRST_NUMBER() - getSECOND_NUMBER();
  }

  double mul() {
    return getFIRST_NUMBER() * getSECOND_NUMBER();
  }

  double div() {
    return getFIRST_NUMBER() / getSECOND_NUMBER();
  }

  // exponent two numbers - raise the first number to the power of the second
  double pow() {
    return Math.pow(getFIRST_NUMBER(), getSECOND_NUMBER());
  }

  // modulo two numbers - return the remainder of the first number divided by the second
  double mod() {
    return getFIRST_NUMBER() % getSECOND_NUMBER();
  }
}