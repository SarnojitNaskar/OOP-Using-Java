public class wc2 {
	public static void main(String[] args) {
		// Primitive types
		int i = 32;
		float f = 19.2F;
		double d = 67.42D;
		long l = 40;
		short s = 20;
		byte b = 10;
		char c='s';
		boolean bl=true;

		// Converting primitive types to wrapper objects (Autoboxing)
		Integer iObj = i; // equivalent to Integer.valueOf(a)
		Double dObj = d; // equivalent to Double.valueOf(d)
		Float fObj=f;
		Character cObj=c;
		Short shortobj=s;
		Long lObj=l;
		Byte bObj=b;
		Boolean blObj=bl;

		// Checking the type of the objects
		if (iObj instanceof Integer) {
			System.out.println("An object of Integer is created.");
		}
		if (dObj instanceof Double) {
			System.out.println("An object of Double is created.");
		}

		// Converting wrapper objects back to primitive types (Unboxing)
		int iPrimitive = iObj; // equivalent to aObj.intValue()
		double dPrimitive = dObj; // equivalent to dObj.doubleValue()

		// Printing the primitive values
		System.out.println("The value of Integer: " + iPrimitive);
		System.out.println("The value of Double: " + dPrimitive);
	}
}


//ok
