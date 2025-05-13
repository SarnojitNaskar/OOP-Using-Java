class box{
	double h, w, d;
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

class vol_13{
	public static void main(String args[]){
		box ob1 = new box(7);
		ob1.vol();
		box ob2 = new box(2, 3, 5);
		ob2.vol();
	}
}
