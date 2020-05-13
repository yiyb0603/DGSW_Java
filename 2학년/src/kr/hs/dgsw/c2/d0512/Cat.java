package kr.hs.dgsw.c2.d0512;

public class Cat implements Printable {
    @Override
    public void print() {
        System.out.println("야옹");
    }

    @Override
    public void eat() {
        System.out.println("생선을 먹어요");
    }
}
