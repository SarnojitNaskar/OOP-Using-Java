interface A {
	void m1();
	void m2();
}
class B implements A{
	public void m1(){
		System.out.println("Method-1");
	}
}
class i11{
	public static void main(String args[]){
		B ob = new B();
		ob.m1();
		ob.m2();
	}
}