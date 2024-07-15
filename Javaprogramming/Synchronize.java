class Table {
    synchronized void printTable(int n) {
        for (int i = 0; i < 6; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class myThread extends Thread {
    Table t;

    myThread(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class myThread2 extends Thread {
    Table t;

    myThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(6);
    }
}

public class Synchronize {
    public static void main(String[] args) {
        Table obj = new Table();
        myThread t1 = new myThread(obj);
        myThread2 t2 = new myThread2(obj);
        t1.start();
        t2.start();

    }
}
