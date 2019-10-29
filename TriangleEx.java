package dgsw_java;

public class TriangleEx
{
	/* ���� �м� P.176
	 	�غ�����, �������� -> 2���� ������ �ּ��� �ʿ��ϰڴ�.
	 	�޼ҵ� -> 3�� �ʿ�
	 		1.main
	 		2.�غ��� ���̸� �����Ű�� ���
	 		3.���̸� ����ϴ� ���
	�����ڸ� ������. : �ǹ̸� �ο�����. -> �ʱⰪ�� �����ϴ� �����ڸ� ������.
	*/
	double bottom, height;
	
	public TriangleEx(double b, double h) // ������ => Ŭ������� �̸��� ����, ��ȯ���� ������ �ʴ´�.
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
