package kr.hs.dgsw.c2.d0513;

public class MyThread extends Thread {
    private String name;
    private long delay;

    public MyThread(String name, long delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        System.out.println(name + " 쓰레드가 시작됨");

        for (int i = 0; i < 30; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + "쓰레드가 종료됨");
    }

    public void execute() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(90L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("최한수", 20L);
        thread1.start();

        MyThread thread2 = new MyThread("여동민", 50L);
        thread2.start();

        MyThread thread3 = new MyThread("김주엽", 25L);
        thread3.start();
    }
}
