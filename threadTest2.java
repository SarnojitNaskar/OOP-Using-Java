class A extends Thread{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println("Thread A");
		}
		System.out.println("Exit from A");
	}
}
class B extends Thread{
	public void run(){
		for(int j=1; j<=5; j++){
			System.out.println("Thread B");
		}
		System.out.println("Exit from B");
	}
}
class threadTest2{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}
}