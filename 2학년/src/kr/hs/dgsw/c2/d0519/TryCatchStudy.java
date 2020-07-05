package kr.hs.dgsw.c2.d0519;

import java.util.Scanner;

public class TryCatchStudy {
    public String method1 () {
        Scanner sc = new Scanner(System.in);
        try {
            String str = "hello";
            System.out.println("check 1");
            int a = 5 / 0;
            System.out.println("check 2");
            sc.close();
            return str;
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("check 4");
        }
        System.out.println("check3");
        return null;
    }

    public static void main(String[] args) {
        TryCatchStudy study = new TryCatchStudy();
        study.method1();

    }
}
