class Flipkart {
	//Flipkart ecommerce giant is offering a flat 20% discount on all purchases given the price of product. WAP to calculate the total 
	//discount and final sp of product.
	public static void main(String args[]) {
		double price = 3700.0;
		double disPer = 0.2;
		double totalDis = price * disPer;
		price = price - totalDis;
		
		System.out.println("Final selling price is: " + price);
		
	}
}