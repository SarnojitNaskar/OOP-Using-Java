class A extends Thread{
	public void run(){
		for(int i=1; i<=20; i++){
			if((i%2)==0)
				System.out.println("Even No. : "+i);
		}
	}
}
class B extends Thread{
	public void run(){
		for(int j=1; j<=20; j++){
			if((j%2)!=0)
				System.out.println("Odd No. : "+j);
		}
	}
}
class threadTest1{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		
		a.setPriority(10);
		b.setPriority(1);
		
		a.start();
		b.start();
	}
}