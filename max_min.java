class max_min {
	public static void main (String args[]){
		int a=10, b=20, c=30;
		if(a>b && a>c){
			System.out.println("Largest No. : "+a);
		}else if(b>a && b>c){
			System.out.println("Largest No. : "+b);
		}else{
			System.out.println("Largest No. : "+c);
		}
		
		if(a<b && a<c){
			System.out.println("Smallest No. : "+a);
		}else if(b<a && b<c){
			System.out.println("Smallest No. : "+b);
		}else{
			System.out.println("Smallest No. : "+c);
		}
	}
}