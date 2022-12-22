package com.assignment1;

public class FindPrime {
	//method to find given number is prime or not
	int isprime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				n=n+1;
				isprime(n);  //to find next prime number
			}
		}
	 return(n); //if the number is a prime number it returns same value else it return the next prime number
	}

	public static void main(String[] args) {
		FindPrime num=new FindPrime();  //creating an object
		int primenumber=5;
		int notprimenumber=8;
		int a=num.isprime(primenumber);
		int b=num.isprime(notprimenumber);
		if(a==primenumber)
			System.out.println(a+" is a prime number");
		else {
			System.out.println(primenumber+" is not a prime number");
		    System.out.println(a+" is the next prime number");
		}
		if(b==notprimenumber)
			System.out.println(b+" is a prime number");
		else {
			System.out.println(notprimenumber+" is not a prime number");
		    System.out.println("so "+b+" is the next prime number");
		}
	}
}
