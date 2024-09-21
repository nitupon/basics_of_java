package Package1;

public class MultipleIIBBlocks {
	
	{
		System.out.println("This is a IIB Block");
	}
	
	{
		System.out.println("This is 2nd IIB Block");
	}
	
	{
		System.out.println("This is 3rd IIB Block");
	}

	public static void main(String[] args) {
		
		MultipleIIBBlocks m1 = new MultipleIIBBlocks();
		System.out.println("Hence multiple IIB Blocks are possible & are executed serially");

	}

}
