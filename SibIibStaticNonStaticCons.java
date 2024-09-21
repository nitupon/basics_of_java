package Package1;

public class SibIibStaticNonStaticCons {
	
	public static void MyName()
	{
		System.out.println("This is a Static class");
	}
	
	void Name() {
		System.out.println("This is a non-static class");
	}
	
	SibIibStaticNonStaticCons()
	{
		System.out.println("This is a constructor");
	}
	
	static
	{
		System.out.println("This is a SIB Block");
	}
	
	{
		System.out.println("This is a IIB Block");
	}

	public static void main(String[] args) {
		MyName();
		SibIibStaticNonStaticCons s1 = new SibIibStaticNonStaticCons();

	}

}
