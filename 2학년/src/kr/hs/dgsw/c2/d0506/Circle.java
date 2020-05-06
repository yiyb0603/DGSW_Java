package kr.hs.dgsw.c2.d0506;

public class Circle extends Polygon {
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String getName() {
        return "원";
    }

    @Override
    public void print() {
        System.out.println(String.format("반지름: %.2f 면적: %.2f", radius, getArea()));
    }
}
