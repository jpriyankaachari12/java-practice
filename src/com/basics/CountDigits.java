package com.basics;
//count digits in a number
public class CountDigits {

	public static void main(String[] args) {
		int number=90;
		int count=0;
while(number!=0) {
	number=number/10;
	count++;
	
}
System.out.println("number of digits="+count);
}

}
