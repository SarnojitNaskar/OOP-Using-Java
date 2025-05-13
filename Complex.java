import java.util.*;

class Complex {
	int real, img;
	Complex (int r, int i){
		real = r;
		img = i;
	}
	void display(){
		System.out.println(real + "+" + img + "i");
	}
	void displayc(){
		System.out.println(real + "" + img + "i");
	}
	static Complex add(Complex n1, Complex n2){
		Complex all1 = new Complex(0, 0);
		all1.real = n1.real + n2.real;
		all1.img = n1.img + n2.img;
		return all1;
	}
	static Complex sub(Complex n1, Complex n2){
		Complex all2 = new Complex(0, 0);
		all2.real = n1.real - n2.real;
		all2.img = n1.img - n2.img;
		return all2;
	}
	static Complex mul(Complex n1, Complex n2){
		Complex all3 = new Complex(0, 0);
		all3.real = n1.real*n2.real - n1.img*n2.img;
		all3.img = n1.real*n2.img + n1.img*n2.real;
		return all3;
	}
	static Complex div(Complex n1, Complex n2){
		Complex all4 = new Complex(0, 0);
		int denominator = n2.real*n2.real + n2.img*n2.img;
        all4.real = (n1.real*n2.real + n1.img*n2.img) / denominator;
        all4.img = (n1.img*n2.real - n1.real*n2.img) / denominator;
		return all4;
	}
	static Complex conj(Complex n1){
		Complex all5 = new Complex(0, 0);
		all5.real = n1.real;
		all5.img = -n1.img;
		return all5;
	}
	
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

        System.out.println("Complex No.-1");
		System.out.print("Enter real part of Complex No.-1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of Complex No.-1: ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

		System.out.println("Complex No.-2");
        System.out.print("Enter real part of Complex No.-2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of Complex No.-2: ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

		System.out.print("\nComplex No.-1 :  ");
		c1.display();
		System.out.print("Complex No.-2 :  ");
		c2.display();

		Complex all1 = add(c1, c2);
		Complex all2 = sub(c1, c2);
		Complex all3  = mul(c1, c2);
		Complex all4  = div(c1, c2);
		Complex all51  = conj(c1);
		Complex all52  = conj(c2);

		System.out.print("\nSum of 2 Complex Nos. :  ");
		all1.display();
		System.out.print("Difference of 2 Complex Nos. :  ");
		all2.displayc();
		System.out.print("Product of 2 Complex Nos. :  ");
		all3.display();
		System.out.print("Modulas of 2 Complex Nos. :  ");
		all4.display();
		System.out.print("Conjugate of Complex No.-1 :  ");
		all51.displayc();
		System.out.print("Conjugate of Complex No.-2 :  ");
		all52.displayc();
	}
}
