package com.assignment3;

import java.util.Scanner;

//check whether given number is magic number or not
//for a magic number the final sum of the digits should always be 1
public class MagicNumorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=scan.nextInt();
		int num=n;
		int sum=0;
		while(num>0) {
			sum=sum+(num%10);
			num=num/10;
			if(num<=0 && sum>9) {
				num=sum;
				sum=0;
			}
		}
		if(sum==1) 
			System.out.println(n+" is a magic number");
		else
			System.out.println(n+" is not a magic number");

	}

}
