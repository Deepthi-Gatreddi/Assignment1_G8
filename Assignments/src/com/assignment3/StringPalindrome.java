package com.assignment3;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a String : ");
			String word = sc.next();
			String rword = "";
			for (int i = (word.length() - 1); i >= 0; i--) {
				rword = rword + word.charAt(i);
			}
			if (word.toUpperCase().equals(rword.toUpperCase())) {
				System.out.println(word + " is a palindrome String");
			} else
				System.out.println(word + " is not a palindrome String");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
