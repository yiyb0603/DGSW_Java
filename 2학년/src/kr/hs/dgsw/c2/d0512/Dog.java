package kr.hs.dgsw.c2.d0512;

public class Dog implements Printable, Countable {
    private int count = 0;

    @Override
    public void print() {
        System.out.println("강아지");
    }

    @Override
    public void eat() {
        System.out.println("고기를 먹어요");
    }

    @Override
    public int count() {
        return ++count;
    }

    public static void main (String[] args) {
        Dog dog = new Dog();

        Printable printable = new Dog();
        printable.print();
        printable.eat();

        Countable countable = new Dog();
        System.out.println(countable.count());

        Printable printable2 = new Cat();
        printable2.print();
        printable2.print();
    }
}
