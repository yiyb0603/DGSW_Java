package kr.hs.dgsw.c2;

public class Animal {
    protected String name;
    protected String sound;

    public void setName (String name) {
        this.name = name;
    }

    public void setSound (String sound) {
        this.sound = sound;
    }

    public String getName () {
        return name;
    }

    public String getSound () {
        return sound;
    }
}
