class Balance 
{
	public static void main(String args[]) {
		double accBal = 10000.0;
		int amt = 3000;
		if(amt <= accBal)
		{
			System.out.println("withdrawal success");
		}
		else 
		{
			System.out.println("Insufficient balance");
		}
	}
}