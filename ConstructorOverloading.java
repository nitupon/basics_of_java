package Package1;

public class ConstructorOverloading {
	
	ConstructorOverloading() {
		System.out.println("This is a Constructor");
	}
	
	ConstructorOverloading(int a){
		
	System.out.println("This is Constructor Overloading");
	}

	public static void main(String[] args) {
		
		new ConstructorOverloading();
		new ConstructorOverloading(9);

	}

}
