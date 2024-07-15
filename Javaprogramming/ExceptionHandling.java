public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
            int arr[] = { 1, 3, 4, 5, 6 };
            for (int i = 0; i <= 10; i++)
                System.out.println(arr[i] + " ");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of index problem!!");
        } finally {
            System.out.println("all exceptions are caught!!");
        }
    }

}
