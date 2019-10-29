package dgsw_java;

public class TriangleExEx 
{
	public static void main(String[] args) 
	{
		TriangleEx tr = new TriangleEx(3,10);
		tr.change(4, 8); // tr.change(b, h);
		tr.area();
		System.out.println("삼각형의 넓이는: " + tr.area() + "입니다.");
	}
}
