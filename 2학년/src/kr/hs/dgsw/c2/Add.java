package kr.hs.dgsw.c2;
import java.util.Scanner;

public class Add {
    public static int input(Scanner sc) {
        int value = sc.nextInt();
        return value;
    }

    public static void add() {
        int sum = 0;
        int start = 0;
        int end = 0;

        Scanner sc = new Scanner(System.in);
        start = input(sc);
        end = input(sc);
        sc.close();

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add();
    }
}
