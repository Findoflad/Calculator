public class Multiplication implements Operation {
    @Override
    public int execute(int num1, int num2) throws CustomOperationException {
        int result = num1 * num2;
        if (result < 0) {
            throw new CustomOperationException("Результат умножения отрицательный.");
        }
        return result;
    }
}