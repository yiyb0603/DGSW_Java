package kr.hs.dgsw.main;

public class TestMain {
    public static void main (String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        MyRunnable thread2 = new MyRunnable();
        thread2.run();

        Thread thread3 = new Thread(thread2);
        thread3.start();

        System.out.println("main Thread exit");
    }
}
