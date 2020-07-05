package kr.hs.dgsw.c2.d0609;

public class PlusCalculator extends Calculator {
    @Override
    public void calculate(int value1, int value2) {
        int result = value1 + value2;
        System.out.println(String.format("%d + %d = %d", value1, value2, result));
    }

    public static void main(String[] args) {
        CalculateStrategy strategy = new PlusStrategy();
        Calculate2 calculate = new Calculate2();
        calculate.execute(strategy);
    }
}
