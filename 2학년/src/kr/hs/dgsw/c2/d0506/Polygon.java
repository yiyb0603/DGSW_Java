package kr.hs.dgsw.c2.d0506;

public abstract class Polygon {
    protected double width;
    protected double height;
    protected double radius;

    public void setWidth (double width) {
        this.width = width;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public void  setRadius (double radius) {
        this.radius = radius;
    }

    public abstract String getName();

    public abstract double getArea();

    public void print() {
        System.out.println(String.format("%s의 면적: %.2f", getName(), getArea()));
    }

    public static void main (String[] args) {
        Polygon rectangle = new Rectangle();
        rectangle.setWidth(6);
        rectangle.setHeight(8);
        rectangle.print();

        Polygon triangle = new Triangle();
        triangle.setWidth(6);
        triangle.setHeight(8);
        triangle.print();

        Polygon circle = new Circle();
        circle.setRadius(5);
        circle.print();
    }
}
