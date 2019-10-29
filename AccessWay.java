package dgsw_java;

class AccessWay
{
	static int num = 0; // static ������ num ����
	
	AccessWay()
	{
		incrCnt();
	}
	
	void incrCnt()
	{
		num++; // Ŭ���� ���ο��� �̸��� ���� ����
	}
}

class ClassVarAccess 
{
	public static void main(String[] args) 
	{
		AccessWay way = new AccessWay();
		way.num++;
		System.out.println("num = " + AccessWay.num);
	}
}