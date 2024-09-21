package Package1;
public class LogicalOperator 
{
	
	static void or()
	{
		int a=99;
		int b=9;
		if(a>10 || b>90)
		{
		System.out.println("My or opeartor");	
		}
	}
	static void and()
	{int a=99;
	int b=9;
	if(a>10 && b>90)
	{
	System.out.println("My and opeartor");	
	}	
	}
	static void andnot()
	{int a=99;
	int b=9;
	if(!(a>10 && b>90))
	{
	System.out.println("My andnot opeartor");	
	}	
	}
	static void ornot()
	{
		int a=99;
		int b=9;
		if(!(a>10 || b>90))
		{
		System.out.println("My ornot opeartor");	
		}
	}
	public static void main(String[] args) 
	{
		or();
		and();
		andnot();
		ornot();

	}

}
