import java.util.*;
class Operations {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);

		int a, b;

		System.out.print("Enter 1st Value : ");
		a=sc.nextInt();
		System.out.print("Enter 2nd Value : ");
		b=sc.nextInt();
		System.out.println("\nAddition : "+(a+b)+"\nSubtraction : "+(a-b)+"\nMultiplication : "+(a*b)+"\nDivision : "+(a/b));
	}
}