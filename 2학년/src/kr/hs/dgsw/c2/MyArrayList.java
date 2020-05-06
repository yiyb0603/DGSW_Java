package kr.hs.dgsw.c2;

import java.util.ArrayList;

public class MyArrayList extends ArrayList<String> {
    public String getLast() {
        if (super.size() == 0) {
            return null;
        } else {
            return get(size() - 1);
        }
    }

    public void reverse() {
        MyArrayList temp = new MyArrayList();
        for (int i = super.size() - 1; i >= 0; i--) {
            temp.add(get(i));
        }

        this.clear();

        for (int i = 0; i < temp.size(); i++) {
            super.add(temp.get(i));
        }
    }

    public void printList () {
        for (String item : this) {
            System.out.print(item + " ");
        }
    }

    public static void main (String[] args) {
        MyArrayList list = new MyArrayList();

        list.add("김주엽");
        list.add("오하형");
        list.add("김혜선");
        list.add("전도권");

        System.out.println("Last: " + list.getLast());
        list.reverse();
        System.out.print("역순: ");
        list.printList();
    }
}
