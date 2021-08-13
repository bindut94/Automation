package inheritance1;

public class Child extends Parent {

	public static void main(String[] args) {

		Parent.Insects();
	   /* Parent p = new Parent();
	    p.Birds(); */
		
		Child c = new Child();
		c.Birds();
		
	}
}
