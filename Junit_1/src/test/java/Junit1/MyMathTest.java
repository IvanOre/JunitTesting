package Junit1;

import Junit1.MyMath;
import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)// ожидаем что будет выброшено это исключение
    public void zeroDenominatorShouldThrowException(){//нулевой делитель должен выбрасывать исключение
        MyMath.divide(1,0);


    }
}
