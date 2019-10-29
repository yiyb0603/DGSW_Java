package dgsw_java;

class AccessWay
{
	static int num = 0; // static 변수로 num 선언
	
	AccessWay()
	{
		incrCnt();
	}
	
	void incrCnt()
	{
		num++; // 클래스 내부에서 이름을 통한 접근
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