package kr.hs.dgsw.c2;
import java.util.Scanner;

public class Dolar {
    public int inputDolar(Scanner sc) {
        System.out.print("달러를 입력하세요: ");
        int dolar = sc.nextInt();
        return dolar;
    }

    public int dolarToWon(Scanner sc) {
        int dolar = inputDolar(sc);
        int resultMoney = dolar * 1233;
        /* 2020년 4월 22일 기준 1달러 한국 돈으로 1233원 */
        return resultMoney;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Dolar dolar = new Dolar();
        System.out.println("변환한 값은 " + dolar.dolarToWon(sc) + "원 입니다.");
    }
}
