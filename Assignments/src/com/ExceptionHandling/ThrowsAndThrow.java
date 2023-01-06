package com.ExceptionHandling;

import java.util.Scanner;

public class ThrowsAndThrow{
	static void EvenorOdd(int num) throws  ArithmeticException{ 
		if(num==0)
			 throw new ArithmeticException("Enter a valid number");
		if(num%2==0) 
			  System.out.println("It is an even number");
		  else
			  System.out.println("it is an odd number");
	  }

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		EvenorOdd(num);  
	}

}
