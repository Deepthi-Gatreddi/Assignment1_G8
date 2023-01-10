package com.assignment3;

import java.util.Scanner;

//Swapping two numbers without using third variable
public class Swap2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the 1st number:");
			int num1 = scan.nextInt();
			System.out.print("Enter the 2nd number:");
			int num2 = scan.nextInt();
			// swapping
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + num2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
