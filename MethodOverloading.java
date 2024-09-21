package Package1;

public class MethodOverloading {
	
	public static void Add() {
	
		System.out.println("This is 1st o/p");
	}

	public static void Add(int a) {
		
		System.out.println("Method is overloaded");
	}
	
	static void Add(int a, double b) {
		
		System.out.println("Method is again overloaded");
		
	}
	
	void Multiply(double d) {
		System.out.println("This a non static method");
		
	}
	
	void Multiply(int s) {
		System.out.println("Static method is overloaded");
	}
	public static void main(String[] args) {
		
		MethodOverloading m1 = new MethodOverloading();
		System.out.println("The following are the ouputs :- ");
		Add();
		Add(5);
		Add(10,1.2);
		m1.Multiply(1.2);
		m1.Multiply(1);
		
	}

}
