import java.util.*;
class eh2{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String s = sc.next();
		try{
			int n = Integer.parseInt(s);
			System.out.print("Converted No. : " + n);
		}catch(NumberFormatException e){
			System.out.println(s+" is not an integer");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}