package methodCalling;

public class Child {
	
	
	static int a = 6, b = 9, sum;

	public int Add()
	{
		sum = a+b;
		System.out.println("Addition of 2 no's:" +  " " +sum);
		return sum;
	}
	
	static void Mul() {
		
		int into = a  * b;
		System.out.println("Multiplication of 2 no's:" +  " " +into);

	}
	
	
}
