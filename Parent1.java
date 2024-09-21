package Package1;

class Parent1 
{  void car()
	{
	System.out.println("Parent class");
	}
}
	
class Child extends Parent1
{
	void car()
	{
		System.out.println("Child class");
	}

	

	public static void main(String[] args) 
	{
		Child c1 = new Child();
		c1.car();
		

	}

}
