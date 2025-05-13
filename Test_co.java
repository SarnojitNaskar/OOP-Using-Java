class sum{
	int add(int a, int b){
		return a+b;
	}
	int add(int a, int b, int c){
		return a+b+c;
	}
	float add(float a, float b){
		return a+b;
	}
	double add(double a, double b){
		return a+b;
	}
}

class Test_co{
	public static void main(String args[]){
		sum s = new sum();
		System.out.println("Sum of two integers : "+ s.add(23, 32));
		System.out.println("Sum of three integers : "+ s.add(20, 43, 69));
		System.out.println("Sum of two float nos. : "+ s.add(19.2f, 43.2f));
		System.out.println("Sum of two double nos. : "+ s.add(20.19, 69.66));
	}
}