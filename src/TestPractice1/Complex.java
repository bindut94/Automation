package TestPractice1;

public class Complex {

	private double re, im;
		
		public String toString() {
			
			return "(" +re + " + " + im + "i)";
		}
		

	 Complex(double c){
		re = c;
		im = c + 0.98;
	    }


	public Complex(Complex c1) {
		// TODO Auto-generated constructor stub
	}

}
