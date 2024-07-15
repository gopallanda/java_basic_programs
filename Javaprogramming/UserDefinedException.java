import java.util.Scanner;

class YouChild extends Exception {
    YouChild(String s) {
        System.out.println(s);
    }
}

public class UserDefinedException {

    void vote(int age) throws YouChild {
        if (age < 18) {
            throw new YouChild("age is not sufficient");
        } else {
            System.out.println("you can vote!");
        }
    }

    public static void main(String[] args) {
        UserDefinedException sc = new UserDefinedException();
        Scanner my = new Scanner(System.in);
        try {
            System.out.println("enter age :");
            int age = my.nextInt();
            sc.vote(age);
        } catch (YouChild e) {
            System.out.println(e.getMessage());
        }

    }

}
