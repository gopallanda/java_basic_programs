import java.util.Scanner;

public class sumofNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter no of terms");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println(" the sum of " + n + "nubers is " + sum);
    }
}
