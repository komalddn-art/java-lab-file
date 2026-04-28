public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        // Array Exception
        try {
            int arr[] = new int[5];
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception!");
        }

        // Arithmetic Exception
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Divide by zero!");
        }
    }
}