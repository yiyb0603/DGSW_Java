package kr.hs.dgsw.c2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

public class DateStudy {
    public static void main (String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println("getDay : " + now.getDay());
        System.out.println("getHour");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println(dateFormat.format(now));

        String sTime = "2020년 2월 17일 13시 20분 14초";
        try {
            Date time2 = dateFormat.parse(sTime);
            System.out.println(time2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        System.out.println("년 : " + calendar.get(Calendar.YEAR));
        System.out.println("월 : " + calendar.get(Calendar.MONTH));
        System.out.println("일 : " + calendar.get(Calendar.DATE));
    }
}
