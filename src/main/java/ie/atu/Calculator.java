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

}
