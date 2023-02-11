package com.bmc.codingpractice;

public class Reverse {
	public static void main(String[] args) {
		
		
		int number=45678;
		int reverse=0;
		while(number!=0) {
			int digit=number%10;
			number=number/10;
			reverse=reverse*10+digit;
			
		}
		
		System.out.println(reverse);

	}
}
