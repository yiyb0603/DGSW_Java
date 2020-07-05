package kr.hs.dgsw.c2.d0610;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("풀");
    }

    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        rabbit.eat();
    }
}
