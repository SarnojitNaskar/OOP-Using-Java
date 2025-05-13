interface A {
	void meth();
}
interface B extends A {
	void meth();
}
class AB implements A, B {
	public void meth(){
		System.out.println("Multiple inheritance in Java using interface");
	}
}
class i1{
	public static void main (String args[]){
		AB ob = new AB();
		ob.meth();
	}
}