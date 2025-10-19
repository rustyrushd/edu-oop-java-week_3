package ie.atu;

public class Calculator
{
    private final double FIRST_NUMBER;
    private final double SECOND_NUMBER;

    public Calculator(double firstNum, double secondNum)
    {
        this.FIRST_NUMBER = firstNum;
        this.SECOND_NUMBER = secondNum;
    }

    public double getFIRST_NUMBER()
    {
        return FIRST_NUMBER;
    }

    public double getSECOND_NUMBER()
    {
        return SECOND_NUMBER;
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