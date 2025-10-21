class PreOp{
	public static void main(String args[]) {
		int a = 10;
		System.out.println(++a); //11
		System.out.println(a);   //11
		
		int b = 7;
		System.out.println(--b);     //6
		System.out.println(b);  	 //6
		
		int p = 17;
		System.out.println(++p);     //18
		System.out.println(++p);     //19
		System.out.println(p);       //19
		
		int q = 13;
		System.out.println(--q);
		System.out.println(--q);
		System.out.println(q);
		
		int x = 7;
		int y = ++x + ++x;
		System.out.println(y);
		
		int m = 5;
		int n = --m + --m;
		System.out.println(n);
		
		int g = 6;
		int h = ++g + ++g + ++g;
		System.out.println(h);
		
		int r = 8;
		int s = ++r + ++r + ++r;
		System.out.println(s);
		
		int c = 12;
		int d = 17;
		int e = ++c + --d + ++c + --d;
		System.out.println(e);
	}
}