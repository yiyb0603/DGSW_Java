package kr.hs.dgsw.main;

public class ThreadFor2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("-");
        }
    }
}