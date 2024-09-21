package Package1;

class Parent {
	
	void car()
	{
		System.out.println("car");
	}
}
	
	 class Override extends Parent {
		
		void car()
		{
			System.out.println("Bike");
		}
	

	public static void main(String[] args) {
		
		Override o1 = new Override();
		o1.car();

	}

}
