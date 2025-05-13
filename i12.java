interface A {
	void m1();
	void m2();
}
abstract class B implements A{
	public void m1(){
		System.out.println("Method-1");
	}
}
class C extends B{
	public void m2(){
		System.out.println("Method-2");
	}
}
class i12{
	public static void main(String args[]){
		C ob = new C();
		ob.m1();
		ob.m2();
	}
}