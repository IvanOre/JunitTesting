package Junit1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Тестируемые методы должны быть public void. И название желательно по смыслу содержать слово should-должен.
 * Тестируемый метод должен содержать action,assertion
 * мы рассматриваем числа равными если они будут отличаться не больше чем на значение дельты 1e-9 = 0.0000000001
 *
 * В каждом тестовом сценарии создаем новый объект класса Vector2D.Это мы можем вынести в вспомогательный метод.
 * @Before
 *     public void createNewVector(){// создаем вектор до тестирования
 *         v1 = new Vector2D();// и тут назначаем новому полю объект класса Vector2D
 *     }
 *     private Vector2D v1;// и храним его в приватном поле
 *     И теперь в каждом тестовом сценарии можем не создавать новый экземпляр объекта класса Vector2D
 *     C помощью аннотации @Before будем его вызвать перед каждым тестовым методом.
 *     @Before выполняется перед каждым тестовым методом и в каждом тестовом методе будет создаваться объект класса
 *     Vector2D
 *     Если сделать private static Vector2D v1; сделать статическим,то будет создаваться один объект класса Vector2D
 *     и делаться между всеми тестовыми методами
 *     @BeforeClass - создает тоже одну статическую переменную объекта Vector2D
 * @After тут не используем. Нечего чистить нам. Но она работает так же как и @Before
 *
 */
public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;// и храним его в приватном поле

    @Before
    public void createNewVector(){// создаем вектор до тестирования
        v1 = new Vector2D();// и тут назначаем новому полю объект класса Vector2D
    }

    @Test
    public void newVectorShouldBeZeroLength(){// новый вектор должен иметь нулевую длину.
        // assertion-проверим что ожидаемый результат совпадает с фактическим
        Assert.assertEquals(0,v1.length(),EPS);//длина вектора1 должна быть 0. и точность 1e-9.
        // 0-что хотим увидеть. v1.length()-что по факту имеем. 1e-9 это дельта точности

    }
    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0,v1.getX(),EPS);

    }
@Test
    public void newVectorShouldHaveZeroY(){
    Assert.assertEquals(0,v1.getY(),EPS);

    }


   /* @Test
    public void newVectorShouldHaveZeroXAndZeroY(){// тк у нас логика простая, то мы можем засунуть 2 теста в один,
        // но такого следует избегать в серьезных проектах
        Assert.assertEquals(0,v1.getX(),EPS);
        Assert.assertEquals(0,v1.getY(),EPS);

    }*/

}
