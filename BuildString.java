package dgsw_java;

public class BuildString 
{
	public static void main(String[] args) 
	{
		// ���ڿ� "123"�� ����� �ν��Ͻ��� ����
		StringBuilder stbuf = new StringBuilder("123");
		stbuf.append(45678); // ���ڿ� �����̱�
		System.out.println(stbuf.toString());
		
		stbuf.delete(0,2);
		System.out.println(stbuf.toString());
		
		stbuf.replace(0, 3, "AB");
		System.out.println(stbuf.toString());
		
		stbuf.reverse();
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2, 4);
		System.out.println(sub);
	}
}