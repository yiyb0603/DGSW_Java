package kr.hs.dgsw.c2.d0609;

import java.util.Scanner;

public abstract class Calculator {
    public void calculate(int value1, int value2) {
        // do nothing
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("두 수를 입력하세요: ");
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();

            if (value1 == 0 && value2 == 0) {
                break;
            }

            calculate(value1, value2);
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}
