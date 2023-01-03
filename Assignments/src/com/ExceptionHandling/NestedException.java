package com.ExceptionHandling;
import java.util.Scanner;

public class NestedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Even number which you want to verify:");
			int even=sc.nextInt();
			System.out.println("Enter a Odd number which you want to verify:");
			int odd=sc.nextInt();
			try {
				if(even%2==0)
					System.out.println("Yes "+even+" is even");
				else
					System.out.println("No "+even+" is not even");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("The code executed first inner try block");
			}
			try {
				if(odd%2!=0)
					System.out.println("Yes "+odd+" is odd");
				else
					System.out.println("No "+odd+" is not odd");
			}
			catch(Exception e1) {
				System.out.println(e1);
			}
			finally {
				System.out.println("The code executed second inner try block");
			}
			
		}
		catch(Exception e2) {
			System.out.println(e2);
		}
		finally {
			System.out.println("The outer try block is executed");
		}

	}
}
