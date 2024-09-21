package Package1;

public class Upcasting {
	
	void Add()
	{
		System.out.println("1st method");
	}
	
	void Subtract()
	{
		System.out.println("2nd method");
	}
	
	public class Something extends Upcasting
	{
		void Add1()
		{
			System.out.println("3rd method");
		}
		
		void Subtract1()
		{
			System.out.println("4th method");
		}
	}
	
	public class Nothing extends Something
	{
		void Add3()
		{
			System.out.println("5th method");
		}
		
		void Subtract3()
		{
			System.out.println("6th method");
		}
	}

	public static void main(String[] args) {
		
						/*Something s1= new Nothing(); 
						s1.Add();
						s1.Subtract();*/

	}

}
