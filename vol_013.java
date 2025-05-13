class box{
	double h, w, d;
	box(){
		h = 1;
		w = 2;
		d = 3;
	}
	box(double len){
		h = w = d = len;
	}
	box(double height, double width, double depth){
		h = height;
		w = width;
		d = depth;
	}
	void vol(){
		System.out.println("Volume : "+ (h*w*d));
	}
}

class vol_013{
	public static void main(String args[]){
		box ob0 = new box();
		ob0.vol();
		box ob1 = new box(7);
		ob1.vol();
		box ob3 = new box(2, 3, 5);
		ob3.vol();
	}
}