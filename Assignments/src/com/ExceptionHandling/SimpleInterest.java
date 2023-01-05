package com.ExceptionHandling;
import java.util.Scanner;

public class SimpleInterest {
	 static float Interest(float P,float T) throws Exception{
		 float interest=(P*T*2)/100;
		 return interest;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Principle Amount");
			float P=sc.nextInt();  
			System.out.println("Enter Time:");
			float T=sc.nextInt();
			try {
				System.out.println("Simple interest is:"+Interest(P,T));
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
