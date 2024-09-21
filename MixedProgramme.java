package Package1;

public class MixedProgramme {
	
	public static void MyName(int a)
	{
		System.out.println("This is a Parameterized Static method");
	}
	
	public static void Name()
	{
		System.out.println("This is a Non-Parameterized Static method");
	}
	
	void Man(int a)
	{
		System.out.println("This a parameterized non-static method");
	}
	
	void Woman()
	{
		System.out.println("This is a non-parameterized non-static method");
	}
	
	MixedProgramme(int a)
	{
		System.out.println("This is a parameterized constructor");
	}
	
	MixedProgramme()
	{
		System.out.println("This is a non-parameterized constructor");
	}
	
	static
	{
		System.out.println("This is a SIB Block");
	}
	
	{
		System.out.println("This is a IIB Block");
	}
			
	

	public static void main(String[] args) {
		MyName(1);
		Name();
		MixedProgramme m1 = new MixedProgramme();
		new MixedProgramme(3);
		m1.Man(2);
		m1.Woman();
		

	}

}
