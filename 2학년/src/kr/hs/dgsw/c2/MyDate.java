package kr.hs.dgsw.c2;

import java.text.SimpleDateFormat;

import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.getTime());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");

        String sTime = "2003년 06월 03일 00시 00분 00초";

        try {
            Date time1 = dateFormat.parse(sTime);
            System.out.println(now.getTime()-time1.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}