package Package1;
public class Manish 
{
	int a;
	double b;
	String c;
	
	void name(int a,double b,String c)
	{
		System.out.println("Hello");
		this.a=a;//this keyword
		this.b=b;
		this.c=c;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("starting");
		Manish m1=new Manish();
		m1.name(11, 2.1, "MKT");
		System.out.println(m1.a);
		System.out.println(m1.b);
		System.out.println(m1.c);

	}

}
