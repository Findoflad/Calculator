import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class OperationTest {

    @Test
    public void testAddition() throws CustomOperationException {
        Operation operation = new Addition();
        int result = operation.execute(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testDivisionByZero() {
        Operation operation = new Division();
        try {
            operation.execute(10, 0);
            fail("Expected CustomOperationException to be thrown");
        } catch (CustomOperationException e) {
            assertEquals("Деление на ноль недопустимо.", e.getMessage());
        }
    }

    @Test
    public void testMultiplication() {
        Operation operation = new Multiplication();
        try {
            int result = operation.execute(5, 6);
            assertEquals(30, result);
        } catch (CustomOperationException e) {
            fail("Unexpected CustomOperationException: " + e.getMessage());
        }
    }

    @Test
    public void testNegativeMultiplicationResult() {
        Operation operation = new Multiplication();
        try {
            operation.execute(-3, 10);
            fail("Expected CustomOperationException to be thrown");
        } catch (CustomOperationException e) {
            assertEquals("Результат умножения отрицательный.", e.getMessage());
        }
    }
}
