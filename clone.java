class box{
	double h, w, d;
	box(double height, double width, double depth){
		h = height;
		w = width;
		d = depth;
	}
	box(box hwd){
		h = hwd.h;
		w = hwd.w;
		d = hwd.d;
	}
	void vol(){
		System.out.println("Volume : "+ (h*w*d));
	}
}

class clone{
	public static void main(String args[]){
		box ob1 = new box(2, 3, 5);
		box ob2 = new box(ob1);
		ob1.vol();
		ob2.vol();
	}
}