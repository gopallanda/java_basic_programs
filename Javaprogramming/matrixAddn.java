import java.util.Scanner;

public class matrixAddn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("enter number of rows and colomns of matrix 1");
        int rows1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("enter number of rows and colomns of matrix 2");
        int rows2 = sc.nextInt();
        int col2 = sc.nextInt();
        int a[][] = new int[rows1][col1];
        int b[][] = new int[rows2][col2];
        System.out.println("enter the elements of first matrix:");
        for (i = 0; i < rows1; i++) {
            for (j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of second matrix:");
        for (i = 0; i < rows1; i++) {
            for (j = 0; j < col1; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("entered matrix 1:");
        for (i = 0; i < rows1; i++) {
            for (j = 0; j < col1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("entered matrix 2:");
        for (i = 0; i < rows1; i++) {
            for (j = 0; j < col1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }
        if (rows1 == rows2 && col1 == col2) {
            int c[][] = new int[rows1][col2];
            for (i = 0; i < rows1; i++) {
                for (j = 0; j < col2; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("Added matrix:");
            for (i = 0; i < rows1; i++) {
                for (j = 0; j < col2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println(" ");
            }
        } else
            System.out.println("matrix addition is not possible");

    }

}
