package kr.hs.dgsw.main;

public class MyRunnable extends Object implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("MyRunnable run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
