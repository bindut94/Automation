package loopPractice;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//for (int i = 2;  ; i++) {
			
			//System.out.println( + i);
			
				
			String[] name = new String[] {"devendhar", "Bindhu" , "Amaira"};
			
			
			for (String x : name) {
				
				if(x.toLowerCase() != null){
			 
				    System.out.println("It's my name");
				    break;
				}
				
		    System.out.println("It's a name");

		   
			}

	}

}
