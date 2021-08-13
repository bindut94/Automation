package inheritance1;

 public class Parent {
	
	static String name = "earthworm";

 public String Birds() {
		
		String a = "Birds hum";
		String b = "Birds eat";
		System.out.println("Input:\n" + a + "\n" + b);
		return b;
	}


 public static String Insects() {
	
	System.out.println("Insects return name:" + " " + name);
	return name;
}
}