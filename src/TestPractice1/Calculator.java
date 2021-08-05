package TestPractice1;

public class Calculator {

		int num = 100;
		
		public void calc(int num) {
			this.num = num * 100;
	
		}
		
		public void printNum() {
			
			System.out.println(num);
		
		}
		
		public static void main(String[] args) {

			Calculator obj = new Calculator();
			obj.calc(2);
		    obj.printNum();
		
		}


}
