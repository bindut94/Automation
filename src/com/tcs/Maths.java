package com.tcs;

public class Maths {
	

	public static void main(String[] args) {
		
		Operators ops=new Operators();
        ops.sum();
        ops.sub();
        ops.multiply();
        ops.divide();
       
	// can we create a variable and assign "+ops.sum to that variable?
        
		System.out.println("Addition of 2 no's: " +ops.sum());
		System.out.println("Subtraction of 2 no's: " +ops.sub());
		System.out.println("Multiplication of 2 no's: " +ops.multiply());
		System.out.println("Division of 2 no's: " +ops.divide());
		
		LearnCon x=new LearnCon(2, 3);
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.e);
		
		

	}

}
