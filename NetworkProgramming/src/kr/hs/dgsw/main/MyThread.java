package kr.hs.dgsw.main;

public class MyThread extends Thread {
    public void printTest() {
        System.out.println("MyThread Print");
    }

    @Override
    public void run() {
        try {
            sleep(500);
        } catch (InterruptedException  e) {
            e.printStackTrace();
        }
        System.out.println("MyThread run");
    }
}
