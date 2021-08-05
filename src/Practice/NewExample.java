package Practice;

public class NewExample {
	
	int a, b;
	String name;
	
	NewExample(int i, String n){
		a = i;
		name = n;
		
		//System.out.println("2 params : " + i + " " + n);
		
	}
	
	NewExample(int i, String n, int j){
		a = i;
		name = n;
		b = j;
		
		//System.out.println("3 params: " + i + " " + n + " " + j);
		
	}
	
	void display()
	{
		System.out.println("Display values of " + a + " " + name + " " + b);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewExample n1 = new NewExample(5, "bhanu");
		NewExample n2 = new NewExample(5, "bhanu", 8);
        
		n1.display();
		n2.display();
		
	}

}
