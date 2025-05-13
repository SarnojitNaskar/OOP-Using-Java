import java.util.*;
class eh3{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" elements : ");
		for (int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		try{
			System.out.print("Elements in array : ");
			for (int i = 0; i<n; i++){
				System.out.print(arr[i]+"\t");
			}
			System.out.print("\n");
			System.out.print("Enter the position to access an element : ");
			int pos = sc.nextInt();
			System.out.println("Element in Index-"+pos+" : "+arr[pos-1]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index is out of range");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}