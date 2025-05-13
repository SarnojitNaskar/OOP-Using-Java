import java.util.*;
class  Point {
	static void distance(double x1, double x2, double y1, double y2){
		double x = Math.pow((x1-x2),2);
		double y = Math.pow((y1-y2),2);
		double xy = x+y;
		double all = Math.sqrt(xy);
		System.out.println("\nDistance between two points : "+ all);
	}
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		double x1, x2, y1, y2;
		System.out.println("Enter Co-ordinates : ");
		System.out.print("Enter x1 : ");
		x1 = sc.nextDouble();
		System.out.print("Enter x2 : ");
		x2 = sc.nextDouble();
		System.out.print("Enter y1 : ");
		y1 = sc.nextDouble();
		System.out.print("Enter y2 : ");
		y2 = sc.nextDouble();
		distance(x1, x2, y1, y2);
	}
}