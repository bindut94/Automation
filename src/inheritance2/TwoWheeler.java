package inheritance2;

public class TwoWheeler extends Vehicle {

	public TwoWheeler() {
		System.out.println("Default 2-wheeler constructor");
	}

	// static String b = Bike();

	public static void Scooty() {

		System.out.println("I like my scooty");

	}

	public void Bike() {

		System.out.println("I like my bike");
		// return 23;
	}

	@Override
	public int Ride() {

		System.out.println("I am riding a 2-wheeler vehicle");
		return 2;
	}
}
