public class Main {
    
    public static void main(String[] args) throws CustomOperationException {
        Operation operation = new Addition();
        int result = operation.execute(3, 7);

        Operation operation2 = new Division();
        operation2.execute(10, 0);
    }
}
