class s11 {
	int a = 3;
	int b;
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
		meth(4);
	}
}