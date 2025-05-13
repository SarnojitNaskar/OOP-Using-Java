class s1 {
	static int a = 3;
	static int b;
	static void meth(int x){
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
	}
	static {
		System.out.println("Static Block");
		b = a*4;
	}
	public static void main (String args[]){
		s1 ob = new s1();
		ob.meth(4);
	}
}