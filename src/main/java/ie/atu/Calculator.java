package ie.atu;

public class Calculator
{
    private final double FIRST_NUMBER;
    private final double SECOND_NUMBER;
    private final String USER_CHOICE;

    public Calculator(double firstNum, double secondNum, String userChoice)
    {
        this.FIRST_NUMBER = firstNum;
        this.SECOND_NUMBER = secondNum;
        this.USER_CHOICE = userChoice;
    }

    public double getFIRST_NUMBER()
    {
        return FIRST_NUMBER;
    }

    public double getSECOND_NUMBER()
    {
        return SECOND_NUMBER;
    }

    public String getUSER_CHOICE()
    {
        return USER_CHOICE;
    }

    // selects operation for two passed numbers and prints result
    void operation()
    {
        double result = 0;

        switch (getUSER_CHOICE()) {
            case "+":
                result = add();
                break;
            case "-":
                result = sub();
                break;
            case "*":
                result = mul();
                break;
            case "/":
                if (getSECOND_NUMBER() == 0) {
                    System.out.println("To infinity and beyond, as the second number = 0!");
                }
                else {
                    result = div();
                }
                break;
            case "^":
                result = pow();
                break;
            case "%":
                result = mod();
                break;
            default:
                System.out.println("Invalid operation selected, please type \"+\" to add, \"-\" to subtract, \"*\" " +
                        "to multiply or \"/\" to divide next time.");
        }
        System.out.println(getFIRST_NUMBER() + " " + getUSER_CHOICE() + " " + getSECOND_NUMBER() + " = " + result);
    }

    double add()
    {
        return getFIRST_NUMBER() + getSECOND_NUMBER();
    }

    double sub()
    {
        return getFIRST_NUMBER() - getSECOND_NUMBER();
    }

    double mul()
    {
        return getFIRST_NUMBER() * getSECOND_NUMBER();
    }

    double div()
    {
        return getFIRST_NUMBER() / getSECOND_NUMBER();
    }

    // exponent two numbers - raise the first number to the power of the second
    double pow()
    {
        return Math.pow(getFIRST_NUMBER(), getSECOND_NUMBER());
    }

    // modulo two numbers - return the remainder of the first number divided by the second
    double mod()
    {
        return getFIRST_NUMBER() % getSECOND_NUMBER();
    }
}