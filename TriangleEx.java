package dgsw_java;

public class TriangleEx
{
	/* 문제 분석 P.176
	 	밑변저장, 높이저장 -> 2개의 변수가 최소한 필요하겠다.
	 	메소드 -> 3개 필요
	 		1.main
	 		2.밑변과 높이를 변경시키는 기능
	 		3.넓이를 계산하는 기능
	생성자를 만들어라. : 의미를 부여하자. -> 초기값을 지정하는 생성자를 만들자.
	*/
	double bottom, height;
	
	public TriangleEx(double b, double h) // 생성자 => 클래스명과 이름이 같고, 반환형을 써주지 않는다.
	{
		bottom = b; // this.bottom = b;
		height = h; // this.height = h;
	}
	
	public void change(double b, double h)
	{
		bottom = b;
		height = h;
	}
	
	public double area()
	{
		return (bottom*height)/2;
	}
}
