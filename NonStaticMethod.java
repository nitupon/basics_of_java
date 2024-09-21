package Package1;

public class NonStaticMethod {
	
	void Nitupon(){
		
		System.out.println("This is a non static method");
	}

	public static void main(String[] args) {
		
		System.out.println("This is how we call non static method in static main method by creating object :-");
		NonStaticMethod n1 = new NonStaticMethod();
		n1.Nitupon();
		n1.Myself();
	}
	
	void Myself() {
		System.out.println("We can write methods below main methods too");
	}

}
