package javajavajava;

class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}

public class YummyCakeOverriding {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();

		c1.yummy(); // 오버라이딩 한 CheeseCake의 yummy 메소드 호출됨
		c2.yummy(); // 오버라이딩 한 CheeseCake의 yummy 메소드 호출됨
	}
}