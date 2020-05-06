package kr.hs.dgsw.c2;

import java.util.ArrayList;
import java.util.Comparator;

public class ListStudy {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] array = new String[10];

        array[0] = "양동현";
        array[1] = "권용빈";
        array[2] = "이지수";

        System.out.println("0 : " + array[0]);
        System.out.println("1 : " + array[1]);
        System.out.println("2 : " + array[2]);

        System.out.println("배열의 크기 : " + array.length);

        list.add("양동현");
        list.add("권용빈");
        list.add("이지수");

        System.out.println("0: " + list.get(0));
        System.out.println("1: " + list.get(1));
        System.out.println("2: " + list.get(2));

        System.out.println("리스트의 크기 : " + list.size()); // 3
        System.out.println("존재 여부 : " + list.contains("김성헌")); // false
        System.out.println("인덱스 : " + list.indexOf("이지수")); // 2

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("정렬 후 : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
