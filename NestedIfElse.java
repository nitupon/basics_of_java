package Package1;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 500;
		int c = 700;
		int d = 1000;
		
		if (a>50)
		{
			if (b>490)
			{
				System.out.println("1st statement is output");
			}	
			
			else
			{
				System.out.println("b<500");
			}
			
			if (c>690)
			{
				System.out.println("3rd statement is the output");
			}	
			
			else
			{
				System.out.println("c<700");
			}	
		}
		
		else 
		{
			System.out.println("a<50");
		}	
	
	}
	}		
		