import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CH17CalculatorTest {

    private CH17Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CH17Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(3, 4);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(8, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
    }
}
