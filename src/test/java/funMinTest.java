import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class funMinTest {

    //@Test(groups = "jUnit", priority = 0, description = "Приверка всевозможных комбинаций по поиску минимального числа для 3 значений введенных пользователем")
    @Test
    public void checkFunMin() {
        assertEquals(funMin.min(1, 2, 3), 1);
        assertEquals(funMin.min(1, 2, 3), 1);
        assertEquals(funMin.min(1, 3, 2), 1);
        assertEquals(funMin.min(2, 1, 3), 1);
        assertEquals(funMin.min(2, 3, 1), 1);
        assertEquals(funMin.min(3, 1, 2), 1);
        assertEquals(funMin.min(3, 2, 1), 1);
        assertEquals(funMin.min(-1, -2, -3), -3);
        assertEquals(funMin.min(3, 5, 3), 3);
        assertEquals(funMin.min(5, 5, 10), 5);
        assertEquals(funMin.min(6, 3, 3), 3);
        assertEquals(funMin.min(2, 2, 2), 2);
        assertEquals(funMin.min(0, 0, 0), 0);
        assertEquals(funMin.min(-2147483648, 5, 2147483647), -2147483648); //4 byte
    }
}