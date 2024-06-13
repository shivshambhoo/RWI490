package Practise;
public class Threadab extends Thread {
    public void run() {
        System.out.println("child Thread");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Threadab p = new Threadab();
        p.setPriority(10);
        p.setDaemon(true); // This makes the thread a daemon thread
        p.start();
    }
}

