package dgsw_java;

public class StringEqualsEx 
{
	public static void main(String[] args)
	{
		String str1 = "�뱸����Ʈ�����";
		String str2 = "�뱸����Ʈ�����";
		String str3 = new String("�뱸����Ʈ�����");
		
		boolean result = (str1 == str2);
		System.out.println(result);
		
		boolean result1 = (str1 == str3);
		System.out.println(result1);
	}
}