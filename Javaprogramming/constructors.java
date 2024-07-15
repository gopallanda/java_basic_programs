class Gopal {
    int age = 60;
    String name = "ram";

    Gopal(Gopal sc) {
        name = sc.name;
        age = sc.age;
        System.out.println(sc.name + " " + sc.age);
    }

    Gopal(int age, String name) {
        // this.age = age;
        // this.name = name;
        System.out.println("name is " + this.name + "age is " + this.age);
    }
}

public class constructors {
    public static void main(String[] args) {
        Gopal sc = new Gopal(30, "GOPAL");
        // System.out.println("name: " + sc.name + "age: " + sc.age);
        Gopal sp = new Gopal(sc);
    }
}