class A {
	void show(){
		System.out.println("Class-A");
	}
}
class B extends A {
	void show(){
		System.out.println("Class-B");
	}
}
class C extends A {
	void show(){
		System.out.println("Class-C");
	}
}

class dmd{
	public static void main(String args[]){
		A ob1 = new A();
		B ob2 = new B();
		C ob3 = new C();
		A ref;
		ref = ob1;
		ob1.show();
		ref = ob2;
		ob2.show();
		ref = ob3;
		ob3.show();
	}
}