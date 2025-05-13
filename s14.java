class s_all {
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
}

class s14{
	public static void main (String args[]){
		s_all.meth(4);
	}
}