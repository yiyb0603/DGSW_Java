package dgsw_java;
import java.util.Scanner;

public class ScanningString 
{
	public static void main(String[] args)
	{
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		
		int num1 = sc.nextInt(); // int�� ������ ����
		int num2 = sc.nextInt(); // int�� ������ ����
		int num3 = sc.nextInt(); // int�� ������ ����
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
	}
}