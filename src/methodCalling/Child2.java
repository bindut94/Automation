package methodCalling;

public class Child2 {
	
	static int a = 3, b = 6;

	
	public static void Sub()
	{
		int s = a-b;
		System.out.println("Sub of 2 no's:" +" " + s);
		//return s;
	}
	
	public int Div() {
		
		int d = Child.a/Child.b;
		System.out.println("Division of 2 no's:" +" " + d);
		return d;
		
	}
	
	public static int Mod() {
		
		int m = a%b;
		System.out.println("Modulus of 2 no's:" +" " + m);
		return m;
		
	}

}
