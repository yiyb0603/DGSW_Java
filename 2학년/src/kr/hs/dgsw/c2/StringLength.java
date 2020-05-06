package kr.hs.dgsw.c2;
import java.util.Scanner;

public class StringLength {
    private String name;

    public StringLength (String name) {
        this.name = name;
    }

    public int getStringA () {
        // "a" 단어 몇번 들었는지 출력 함수
        int count = 0;
        for (int i = 0; i < this.name.length(); i++) {
            if (this.name.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public String isStringGetAt () {
        // "at" 단어 포함 여부 함수
        String bool;

        if (this.name.contains("at")) {
            bool = "포함";
        } else {
            bool = "불포함";
        }
        return bool;
    }

    public void reverseString () {
        // 단어 역순 뒤집는 함수
        System.out.print("역순: ");
        for (int i = this.name.length() - 1; i >= 0; i--){
            System.out.print(this.name.charAt(i));
        }
        System.out.println("");
    }

    public int wordLength () {
        // 단어 길이 구하는 함수
        int count = 1;
        for (int i = 0; i < this.name.length(); i++) {
            if (this.name.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String name = sc.nextLine();
        StringLength string = new StringLength(name);

        System.out.println("길이: " + name.length());
        System.out.println("a의 개수: " + string.getStringA());
        System.out.println("at 포함 여부: " + string.isStringGetAt());
        string.reverseString();
        System.out.println("단어 개수: " + string.wordLength());
    }
}