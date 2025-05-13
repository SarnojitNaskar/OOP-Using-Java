import java.util.*;
class peri_ar{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);

		int s, a, b, c;
		double x;

		System.out.print("Enter 1st Side : ");
		a=sc.nextInt();
		System.out.print("Enter 2nd Side : ");
		b=sc.nextInt();
		System.out.print("Enter 3rd Side : ");
		c=sc.nextInt();

		s = (a+b+c)/2;
		x = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("Perimeter : "+s*2);
		System.out.println("Area : "+ x);
	}
}