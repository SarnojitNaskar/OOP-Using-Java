import java.util.*;
class ns {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);

		int n, i;
		String s;

		System.out.print("Enter No. of Iteration : ");
		n=sc.nextInt();
		System.out.print("Enter the String : ");
		s=sc.next();
		for(i=0;i<n;i++){
			System.out.println(s);
		}
	}
}