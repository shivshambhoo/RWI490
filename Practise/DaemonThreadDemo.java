package Practise;


public class DaemonThreadDemo extends Thread {
    public void run() {
        System.out.println("this is child Thread");
    }

    public static void main(String[] args) {
        System.out.println("parent thread");
        DaemonThreadDemo d = new DaemonThreadDemo();
        // d.setDaemon(false); // Not needed, threads are non-daemon by default
        d.start();
    }
}