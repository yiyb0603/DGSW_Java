package kr.hs.dgsw.c2.d0610;

public class Animal {
    protected Sound sound;

    protected void eat() {
        System.out.println("고기");
    }

    protected void sound() {
        this.sound.sound();
    }

    protected void setSound (Sound sound) {
        this.sound = sound;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setSound(new Sound() {
            @Override
            public void sound() {
                System.out.println("멍멍");
            }
        });

        Animal cat = new Animal();
        cat.setSound(new Sound() {
            @Override
            public void sound() {
                System.out.println("야옹");
            }
        });
    }
}
