import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testGetFibonacci_Zero() {
        List<Integer> result = Fibonacci.getFibonacci(0);
        assertTrue(result.isEmpty(), "Список должен быть пустым для n = 0");
    }

    @Test
    public void testGetFibonacci_One() {
        List<Integer> result = Fibonacci.getFibonacci(1);
        assertEquals(List.of(0), result, "Список должен содержать только 0 для n = 1");
    }

    @Test
    public void testGetFibonacci_Two() {
        List<Integer> result = Fibonacci.getFibonacci(2);
        assertEquals(List.of(0, 1), result, "Список должен содержать 0 и 1 для n = 2");
    }

    @Test
    public void testGetFibonacci_Three() {
        List<Integer> result = Fibonacci.getFibonacci(3);
        assertEquals(List.of(0, 1, 1), result, "Список должен содержать 0, 1 и 1 для n = 3");
    }

    @Test
    public void testGetFibonacci_Ten() {
        List<Integer> result = Fibonacci.getFibonacci(10);
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), result, "Список должен содержать первые 10 чисел Фибоначчи");
    }
}