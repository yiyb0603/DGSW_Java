package kr.hs.dgsw.c2;
import java.util.Scanner;

public class Calculate {
    public static void howCalculateNumber(Scanner sc) {
        int number;
        System.out.println("(1) 덧셈");
        System.out.println("(2) 뺄셈");
        System.out.println("(3) 곱셈");
        System.out.println("(4) 나눗셈");
        System.out.print("무슨 계산을 할지 번호를 입력하세요 : ");
        number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("결과는 " + plusNumber(sc) + " 입니다.");
                break;

            case 2:
                System.out.println("결과는 " + minusNumber(sc) + " 입니다.");
                break;

            case 3:
                System.out.println("결과는 " + multipleNumber(sc) + " 입니다.");
                break;

            case 4:
                System.out.println("결과는 " + divideNumber(sc) + " 입니다.");
                break;
            default:
                System.out.println("숫자를 잘못 입력하셨습니다.");
                howCalculateNumber(sc);
        }
    }

    public static int inputNumber(Scanner sc) {
        return sc.nextInt();
    }

    public static int plusNumber(Scanner sc) {
        System.out.print("두개의 숫자를 입력해주세요 : ");
        int num1 = inputNumber(sc);
        int num2 = inputNumber(sc);
        return num1 + num2;
    }

    public static int minusNumber(Scanner sc) {
        System.out.print("두개의 숫자를 입력해주세요 : ");
        int num1 = inputNumber(sc);
        int num2 = inputNumber(sc);
        return num1 - num2;
    }

    public static int multipleNumber(Scanner sc) {
        System.out.print("두개의 숫자를 입력해주세요 : ");
        int num1 = inputNumber(sc);
        int num2 = inputNumber(sc);
        return num1 * num2;
    }

    public static int divideNumber(Scanner sc) {
        System.out.print("두개의 숫자를 입력해주세요 : ");
        int num1 = inputNumber(sc);
        int num2 = inputNumber(sc);
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        howCalculateNumber(sc);
        sc.close();
    }
}
