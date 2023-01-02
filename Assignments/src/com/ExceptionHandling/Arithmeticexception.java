package com.ExceptionHandling;
import java.util.Scanner;

public class Arithmeticexception{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
	try {
		int addition=num1+num2;
		System.out.println("There is no exception");
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("Exception is successfully handled");
	}
	try {
		int divison=num1/num2;
	}
	catch(ArithmeticException e1) {
		System.out.println(e1);
		System.out.println("Exception is succesfully handled");
	}
	finally {
	    System.out.println("code is executed");
	}

}
}
