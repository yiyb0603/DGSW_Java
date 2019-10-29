package dgsw_java;

public class StringEqualsEx 
{
	public static void main(String[] args)
	{
		String str1 = "대구소프트웨어고";
		String str2 = "대구소프트웨어고";
		String str3 = new String("대구소프트웨어고");
		
		boolean result = (str1 == str2);
		System.out.println(result);
		
		boolean result1 = (str1 == str3);
		System.out.println(result1);
	}
}