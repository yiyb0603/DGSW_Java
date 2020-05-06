package kr.hs.dgsw.c2;
import java.util.Scanner;

public class Money {
    public int inputMoney(Scanner sc) {
        System.out.print("돈을 입력하세요: ");
        int inputValue = sc.nextInt();
        return inputValue;
    }

    public void calculateMoney(Scanner sc) {
        int []moneyLength = new int[8];
        int []numberArray = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
        int money = inputMoney(sc);

        for (int i = 0; i < moneyLength.length; i++) {
            moneyLength[i] = money / numberArray[i];
            money = money % numberArray[i];
            System.out.println(numberArray[i] + "원 권 " + moneyLength[i] + "개");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Money money = new Money();
        money.calculateMoney(sc);
        sc.close();
    }
}
