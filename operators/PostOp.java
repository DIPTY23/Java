class PostOp{
	public static void main(String args[]) {
		int a = 5;
		System.out.println(a++); //5
		System.out.println(a);   //6
		
		int b = 35;
		System.out.println(b--);     //35
		System.out.println(b);  	 //34
		
		int p = 13;
		System.out.println(p++);
		System.out.println(p++);
		System.out.println(p);
		
		int q = 18;
		System.out.println(q--);
		System.out.println(q--);
		System.out.println(q);
		
		int x = 10;
		int y = x++ + x++;
		System.out.println(y);
		
		int m = 15;
		int n = m-- + m--;
		System.out.println(n);
		
		int r = 17;
		int s = r++ + r++ + r++;
		System.out.println(s);
		
		int c = 25;
		int d = 23;
		int e = c-- + d-- + c-- + d++;
		System.out.println(e);
	}
}