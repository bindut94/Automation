package methodCalling;

public class Parent {

	public static void main(String[] args) {
		
		Child op = new Child();
		op.Add();
		
		Child2.Sub();
		Child.Mul();
		Child2 op1 = new Child2();
		op1.Div();
		Child2.Mod();
		Parent p = new Parent();
		//p.Add();
	}

}
