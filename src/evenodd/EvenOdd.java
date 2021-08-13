package evenodd;

//incomplete

public class EvenOdd {

	public static void main(String[] args) {

		int[] number = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int i = 1; i < 10; i++) {

			if (i == 1) {
				System.out.println("even no:" + i);
			}

			else if (i <= 3) {
				System.out.println("odd no:" + i);
			} else {
				System.out.println("even no:" + i);

			}
		}
	}

}
