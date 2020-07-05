package kr.hs.dgsw.c2.d0519;

public class MyException extends Exception {
    public MyException (String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "나만의 예외";
    }
}
