public class Division implements Operation {
    @Override
    public int execute(int num1, int num2) throws CustomOperationException {
        if (num2 == 0) {
            throw new CustomOperationException("Деление на ноль недопустимо.");
        }
        return num1 / num2;
    }
}