import java.util.Scanner;

public class seriesH {
    public static void main(String[] args) {
        int n, i, j;
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of terms");
        n = sc.nextInt();
        System.out.println("enter the digit");
        int x = sc.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + (x * i);
        }
        System.out.println("the sum of squares of " + n + "terms of the digit" + x + " is " + sum);

    }
}
