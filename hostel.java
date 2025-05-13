class room {
	double len, br;
	room(double l, double b){
		len = l;
		br = b;
	}
	void calc_area(){
		double area = len*br;
		System.out.println("Area of the Room : " + area);
	}
}
class bedroom extends room {
	double bathroom, study_table, nightlamp;
	bedroom (double x, double y, double br, double sttb, double ntlmp){
		super(x, y);
		bathroom = br;
		study_table = sttb;
		nightlamp = ntlmp;
	}
	void display(){
		System.out.println("Bathroom : " + bathroom + "\nStudy Table : " + study_table + "\nNight Lamp : " + nightlamp);
	}
}
class drawing extends room {
	double sofa, wall_cabinet;
	drawing (double x, double y, double sf, double wc){
		super(x, y);
		sofa = sf;
		wall_cabinet = wc;
	}
	void display(){
		System.out.println("Sofa : " + sofa + "\nWall Cabinet : " + wall_cabinet);
	}
}

class hostel{
	public static void main(String args[]){
		room rm = new room(1480, 1560);
		rm.calc_area();
		bedroom br = new bedroom(440, 310, 3, 8, 8);
		System.out.println("\nBedroom");
		br.calc_area();
		br.display();
		drawing dr = new drawing(230, 130, 1, 3);
		System.out.println("\nDrawing Room");
		dr.calc_area();
		dr.display();
	}
}