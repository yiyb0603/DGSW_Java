package kr.hs.dgsw.c2.d0609;

import java.util.Scanner;

public class Calculate2 {
    public void execute(CalculateStrategy strategy) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("두 수를 입력하세요: ");
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();

            if (value1 == 0 && value2 == 0) {
                break;
            }

            strategy.calculate(value1, value2);
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}
