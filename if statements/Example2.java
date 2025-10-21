class Example2 {
	public static void main(String args[]) {
		int n = 12;
		if(n%2 == 0 && n%3 == 0) 
		{
			System.out.println("Bangalore");
		}
		else if(n%2 == 0) 
		{ 	
			System.out.println("Chennai");
		}
		else if(n%3 == 0)
		{
			System.out.println("Hyderabad");
		}
		else 
		{
			System.out.println("Cochin");
		}
	}
}