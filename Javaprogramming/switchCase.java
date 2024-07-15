import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter 1 to check Armstrong or not");
            System.out.println("enter 2 to check Prime or not or not");
            System.out.println("enter 3 to find gcd of two numbers ");
            System.out.println("enter 4 to reverse a number ");
            System.out.println("enter 5 to find factorial of a number");
            System.out.println("enter 6 to check wether a number is Perfect or not ");
            System.out.println("enter 7 to check wether a number is Anagram number or not ");
            System.out.println("enter 8 to find lcm of two numbers ");
            System.out.println("enter 9 to Eat FIVE STAR and Do Nothing!! ");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("enter a number");
                    int n = sc.nextInt();
                    int s = n;
                    int sum = 0;
                    while (n != 0) {
                        int r = n % 10;
                        sum = sum + (r * r * r);
                        n = n / 10;
                    }
                    if (sum == s)
                        System.out.println("the number is an armstrong number");
                    else
                        System.out.println("the number is not an armstrong number");
                }
                    break;
                case 2: {
                    System.out.println("enter a number");
                    int n = sc.nextInt();
                    int s = n;
                    int flag = 0;
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0)
                            flag++;

                    }
                    if (flag == 2)
                        System.out.println("the number " + s + " is a prime number");
                    else
                        System.out.println("the number " + s + " is a composite number");

                }
                    break;
                case 3: {
                    System.out.println("enter first number");
                    int n = sc.nextInt();
                    System.out.println("enter second number");
                    int m = sc.nextInt();
                    int gcd = 1;
                    for (int i = 1, j = 1; i <= n && j <= m; i++, j++) {
                        if (n % i == 0 && m % i == 0)
                            gcd = i;
                    }
                    System.out.println("the gcd of " + n + " and " + m + "is: " + gcd);
                }
                    break;
                case 4: {
                    System.out.println("enter a number");
                    int n = sc.nextInt();
                    int s = n;
                    int sum = 0;
                    while (n != 0) {
                        int r = n % 10;
                        sum = sum * 10 + r;
                        n = n / 10;
                    }
                    System.out.println("reversed number of " + s + " is: " + sum);

                }
                    break;
                case 5: {
                    System.out.println("enter a number to find its factorial value");
                    int n = sc.nextInt();
                    int s = n;
                    int sum = 1;
                    for (int i = 1; i <= n; i++) {
                        sum = sum * i;
                    }
                    System.out.println("the factorial value of" + s + " is: " + sum);
                }
                    break;
                case 6: {

                    System.out.println("enter a number to check Perfect or not!");
                    int n = sc.nextInt();
                    int s = n;
                    int sum = 0;
                    for (int i = 1; i < n; i++) {
                        if (n % i == 0)
                            sum = sum + i;
                    }
                    if (s == sum)
                        System.out.println("the number " + s + " is a Perfect number");
                    else
                        System.out.println(" the number " + s + " is not a perfect number..");
                }
                    break;
                case 7: {
                    System.out.println("enter a number");
                    int n = sc.nextInt();
                    int s = n;
                    int sum = 0;
                    while (n != 0) {
                        int r = n % 10;
                        sum = sum * 10 + r;
                        n = n / 10;
                    }
                    if (s == sum)
                        System.out.println("the number " + s + " is an Anagram number ");
                    else
                        System.out.println("the number " + s + " is not an Anagram number ");
                }
                    break;
                case 8: {
                    System.out.println("enter first number");
                    int n = sc.nextInt();
                    System.out.println("enter second number");
                    int m = sc.nextInt();
                    int gcd = 1;
                    for (int i = 1, j = 1; i <= n && j <= m; i++, j++) {
                        if (n % i == 0 && m % i == 0)
                            gcd = i;
                    }
                    int lcm = (n * m) / gcd;
                    System.out.println(" lcm of two numbers " + n + "and " + m + "is :" + lcm);

                }
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("please enter correct option");

            }
        } while (true);
    }

}
