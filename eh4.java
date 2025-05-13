class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class eh4{
	public static void main (String args[]){
		try{
			throw new MyException("SN");
		}
		catch(MyException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Always at your service");
		}
	}
}