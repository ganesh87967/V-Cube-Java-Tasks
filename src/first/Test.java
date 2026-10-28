package first;

public class Test {
	Test obj1= new Test();
	
	static {
		System.out.println( "static block");
	}
	{System.out.println("instance");}
	public static void main(String[] args) {
		Test obj= new Test();	

	}

}
