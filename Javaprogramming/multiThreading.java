class A extends Thread {
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 5; i++)
            System.out.println(" " + (char) ch++);
    }
}

class B extends Thread {
    public void run() {
        char ch = 'a';
        for (int i = 0; i < 5; i++)
            System.out.println(" " + (char) ch++);
    }
}

class C extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++)
            System.out.println(" " + i);
    }
}

public class multiThreading {
    public static void main(String[] args) {

        new A().start();
        new B().start();
        new C().start();

    }

}
