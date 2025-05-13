class box{
	double h, w, d;
	box(double height, double width, double depth){
		h = height;
		w = width;
		d = depth;
	}
	double volume(){
		return(h*w*d);
	}
}

class vol_c{
	public static void main (String args[]){
		box ob1 = new box(2, 4, 5);
		ob1.volume();
		box ob2 = new box(1, 2, 8);
		ob2.volume();
		if(ob1.volume() > ob2.volume())
			System.out.println("Largest Box : Box-1\n"+"Volume : "+(ob1.volume()));
		else
			System.out.println("Largest Box : Box-2\n"+"Volume : "+(ob2.volume()));
	}
}