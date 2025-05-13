class A{
	void meth(){
		System.out.println("Class-A");
	}
}
class B{
	void meth(){
		System.out.println("Class-B");
	}
}
class C extends A,B{
	void meth(){
		System.out.println("Class-C");
	}
}
class abc{
	public static void main(String args[]){
		C c = new C();
		c.meth();
	}
}