import java.util.Scanner;

public class seriesF {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of numbers");
        n = sc.nextInt();
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                sum = sum + (i * i);
            else
                sum = sum - (i * i);
        }
        System.out.println("the sum of series of " + n + " numbers is " + sum);
    }
}