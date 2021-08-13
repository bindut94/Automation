package inheritance2;

public class Overloading extends FourWheeler {

	public Overloading() {
		System.out.println("I am the first method - overloading");
	}

	public Overloading(int i) {
		super(i);
		System.out.println(i + "\nI am in 2nd method");
	}

	public Overloading(int i, String suzuki) {
		System.out.println(suzuki + "Yay!! I am in third method");
	}

	public static void main(String[] args) {

		Vehicle v = new TwoWheeler();
		v.Ride();
		Vehicle v1 = new FourWheeler(3);
		v1.Ride();

		Overloading o = new Overloading();
		o.Bike();

		/*
		 * Here if we specify an object creation for any particular parent - child, then
		 * methods in that child will be overridden and get executed. If we do not
		 * specify the child class during object creation, then it will automatically
		 * override it's immediate parent's method and it will get executed.
		 */

		Vehicle o1 = new Overloading();
		o1.Ride();

	}

}
