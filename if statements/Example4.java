class Example4 {
	public static void main(String args[]) {
		double percentage = 12;
		if(percentage >= 85) 
		{
			System.out.println("Distinction");
		}
		else if(percentage>=70 && percentage < 85)  
		{ 	
			System.out.println("First class");
		}
		else if(percentage>=60 && percentage<70)
		{
			System.out.println("Second class");
		}
		else if(percentage>=35 && percentage<60)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}