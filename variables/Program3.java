class Program3 {
	public static void main(String args[]) {
		float val = 3.5;                     //error: incompatible types: possible lossy conversion from double to float
		//mandatory to assign suffix as 'F' or 'f'
		System.out.println(val);
		
		long aadhaar = 232345456767l;		 //mandatory to assign suffix as 'L' or 'l'
		System.out.println(aadhaar);
	}
}
		