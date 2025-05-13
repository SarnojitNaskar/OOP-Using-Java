import java.util.*;
class peri_ar2{
	public static void main (String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		double s = (a+b+c)/2;
		System.out.println("Perimeter : "+s*2);
		double x = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area : "+ x);
	}
}