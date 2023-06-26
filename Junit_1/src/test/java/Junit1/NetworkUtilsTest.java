package Junit1;

import Junit1.NetworkUtils;
import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 1000)// ожидаем что метод исполнится быстрее чем за 1000 мс
    public void getConnectionShouldFasterThanOneSecond(){
        NetworkUtils.getConnection();

    }
}
