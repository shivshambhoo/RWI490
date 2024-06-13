package Practise;

class ThreadEx extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadEx: " + i);
        }
    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        ThreadEx t = new ThreadEx();
        ThreadEx t1 = new ThreadEx();

        t1.setDaemon(true); // Set t1 as a daemon thread
        t.start();
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread: " + i);
        }

        System.out.println("t1 is daemon: " + t1.isDaemon());
        System.out.println("t is daemon: " + t.isDaemon());
    }
}
