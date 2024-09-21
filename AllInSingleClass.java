package Package1;

public class AllInSingleClass {
	
	 AllInSingleClass() {
		
		System.out.println("This is a constructor");
	}

	public static void method() {
		
		System.out.println("This is a static method");
	}
	
	public static void method(int a) {
		System.out.println("This is the overloaded static method");
	}
	
	public void methods() {
		System.out.println("This is a non-static method");
	}
	public void methods(int a) {
		System.out.println("This is the overloaded non-static method");
	}
	public static void main(String[] args) {
	
	//	new AllInSingleClass();
		method();
		method(9);
		AllInSingleClass m1 = new AllInSingleClass();
		m1.methods();
		m1.methods(8);
		
	

	}

}
