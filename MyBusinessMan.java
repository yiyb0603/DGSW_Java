package javajavajava;

class Man {
	String name;
	protected static int count = 0;

	public Man(String name) {
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man {
	String position;
	String company;

	public BusinessMan(String name, String position, String company) {
		super(name);
		this.position = position;
		this.company = company;
	}

	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		System.out.println(count);
		tellYourName();
	}
}

class MyBusinessMan {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
		man.tellYourInfo();
	}
}