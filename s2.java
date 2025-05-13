class A {
	int outer_x = 100;
	void test (){
		B ob = new B();
		ob.display();
	}
	class B {
		void display (){
			System.out.println(outer_x);
		}
	}
}

class s2 {
	public static void main (String args[]){
		A ob1 = new A();
		ob1.test();
	}
}