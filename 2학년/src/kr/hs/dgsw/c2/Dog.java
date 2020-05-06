package kr.hs.dgsw.c2;

public class Dog extends Animal {
    private String nickname;

    public Dog () {

    }

    public void setNickname (String nickname) {
        this.nickname = nickname;
    }

    public String getNickname () {
        return nickname;
    }

    @Override
    public String getName () {
        return super.getName();
    }

    public static void main (String[] args) {
        Dog dog = new Dog();
        Animal puppy = new Dog();

        dog.setName("강아지");
        puppy.setName("반려견");

        System.out.println(dog.getName());
        System.out.println(puppy.getName());
    }
}
