abstract class ArithmaticOP {
    abstract void printInfo();
}

class Addition extends ArithmaticOP {
    void printInfo() {
        int a = 5;
        int b = 7;
        System.out.println("addition:" + a + "+" + b + "=" + (a + b));
    }
}

class Sub extends ArithmaticOP {
    void printInfo() {
        int a = 6;
        int b = 3;
        System.out.println("subtraction: " + a + "-" + b + "=" + (a - b));
    }
}

public class AbstracrClass {
    public static void main(String[] args) {
        Addition as = new Addition();
        as.printInfo();
        Sub cs = new Sub();
        cs.printInfo();
    }

}
