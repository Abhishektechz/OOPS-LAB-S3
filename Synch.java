import java.util.*;

class Table {
    synchronized public void printTable(int n) {
        try {
            for(int i = 1; i <= n; i++) {
                System.out.println(n * i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(10);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

public class Synch {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
