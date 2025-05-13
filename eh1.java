import java.util.*;
class eh1{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Dividend : ");
		int n = sc.nextInt();
		System.out.print("Enter Divisor : ");
		int d = sc.nextInt();
		try{
			double q = n/d;
			System.out.println("Quotient : "+q);
		}catch(ArithmeticException e){
			System.out.println(n + " not divisible by "+d);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}