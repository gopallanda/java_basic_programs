class ExThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("child: " + i);
    }
}

public class myThreadextendingThread {
    public static void main(String[] args) {
        ExThread ec = new ExThread();
        ec.start();
        for (int i = 0; i < 5; i++)
            System.out.println("parent: " + i);

    }

}
