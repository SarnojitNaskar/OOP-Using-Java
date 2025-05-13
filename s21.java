class A {
	int outer_x = 100;
	void test (){
		B ob = new B();
		ob.display();
		System.out.println(ob.inner_y);
	}
	class B {
		int inner_y = 200;
		void display (){
			System.out.println(outer_x);
		}
	}
}

class s21 {
	public static void main (String args[]){
		A ob1 = new A();
		ob1.test();
		A ob2 = ob.B();
		ob2.display();
	}
}