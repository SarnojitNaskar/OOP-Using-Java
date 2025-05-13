import java.util.*;
class fc {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);

		int f;

		System.out.print("Enter Fahrenheit : ");
		f=sc.nextInt();
		System.out.println("In Celsius : "+ (((f-32)/9)*5));
	}
}