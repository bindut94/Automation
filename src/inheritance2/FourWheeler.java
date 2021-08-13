package inheritance2;

public class FourWheeler extends TwoWheeler {

	public FourWheeler() {
		System.out.println("I am in default 4-wheeler constructor");
	}

	public FourWheeler(int j) {
		System.out.println(j + "\nI am in parameterized 4-wheeler constructor");
	}

	public void car() {
		System.out.println("It's my car");
	}

	@Override
	public int Ride() {

		System.out.println("I am riding a 4-wheeler vehicle");
		return 2;
	}

	public static void main(String[] args) {

	}

}
