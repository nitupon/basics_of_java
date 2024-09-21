package Package1;

public class OverloadMainMethod {

	public static void main(String[] args) {
		
		System.out.println("This is the main method");
		main();
		main(1,0.5);

	}

	public static void main() {
		
		System.out.println("Main method is overloaded");
	}
	
	public static void main(int a, double c) {
		
		System.out.println("Main method overloading is possible");
	}
	
	
}
