class SimpleInterest {
//Imagine you are a bank employee and WAP to calculate SI using given data.
	public static void main(String args[]) {
		double principle = 100000.0;
		int tenure = 2;
		double rate = 11.5;
		double SI = (principle*tenure*rate)/100;
		System.out.println("Simple Interest is: "+ SI);
		
		//calculate total repayment
		double totalRepayment = principle + SI;
		System.out.println("Total Repayment is " + totalRepayment);
		
		double emi = totalRepayment/(tenure*12);
		System.out.println(emi);
	}
}
		