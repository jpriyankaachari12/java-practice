package com.basics;
//Palindrome number
public class PalindromeNumber {

	public static void main(String[] args) {
		int number=980;
		int original=0;
		int reverse=0;
		while(number!=0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
		}
		if(original==reverse) {
			System.out.println("its a palidrome number");
		}else {
			System.out.println("not  a palidrome number");
		}

	}

}
