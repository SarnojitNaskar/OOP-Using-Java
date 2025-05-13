abstract class TwoDShape{
	double dim1, dim2;
	TwoDShape(double d1, double d2){
		dim1 = d1;
		dim2 = d2;
	}
	abstract void area();
}
class Rectangle extends TwoDShape{
	Rectangle(double d1, double d2){
		super(d1, d2);
	}
	void area(){
		double area = dim1*dim2;
		System.out.println("Area of the Rectangle : " + area);
	}
}
class compute {
	public static void main(String args[]){
		Rectangle ob1 = new Rectangle(24, 32);
		Rectangle ob2 = new Rectangle(45, 21);
		System.out.println("Rectangle-1");
		ob1.area();
		System.out.println("Rectangle-2");
		ob2.area();
	}
}