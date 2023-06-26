package Junit1;

public class MyMath {
    public static double divide(int number1,int number2){
        if (number2 == 0)
            throw new ArithmeticException("Делить на 0 нельзя");
        return (double) number1 / number2;
    }
}
