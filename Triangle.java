package dgsw_java;

public class Triangle
{
	double width, height;
	// ������
	public Triangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void change(double Cwidth, double Cheight)
	{
		width = Cwidth;
		height = Cheight;
	}
	
	public double total(double width, double height)
	{
		double area;
		area = (width * height) / 2;
		return area;
	}
	
	public static void main(String[] args)
	{
		Triangle triangle = new Triangle(0, 0);
		triangle.change(10.5, 20.1);
		System.out.println("�ﰢ���� ���̴� " + triangle.total(triangle.width,  triangle.height));
	}
}