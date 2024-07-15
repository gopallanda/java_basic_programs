class myThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("child" + i);
    }
}

public class myThreadImplementingRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new myThread());
        t.start();
        for (int i = 0; i < 5; i++)
            System.out.println("parent" + i);

    }

}
