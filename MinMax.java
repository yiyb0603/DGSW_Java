package javajavajava;
import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++)
			array[i] = sc.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}