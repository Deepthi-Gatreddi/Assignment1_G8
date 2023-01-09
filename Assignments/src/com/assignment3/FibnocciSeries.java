package com.assignment3;
//Addition of previous two digits in the series will give the next digit in the series
public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int sum;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<5;i++) {
			sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
		}

	}

}
