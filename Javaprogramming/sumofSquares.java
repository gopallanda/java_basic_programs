
import java.util.Scanner;

public class sumofSquares {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of terms");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + i * i;
        }
        System.out.println("sum of squares of " + n + "natual numbers is " + sum);

    }
}
