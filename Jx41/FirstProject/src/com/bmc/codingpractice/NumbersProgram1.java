package com.bmc.codingpractice;

public class NumbersProgram1 {

	public static void main(String[] args) {
		
		int number=45678;
		int evenSum=0;
		int oddSum=0;
		
		while(number!=0) {
			int digit=number%10;
			if(digit%2==0) {
				evenSum=evenSum+digit;
				
			}
			else {
				oddSum=oddSum+digit;
			}number=number/10;
		}
		
		System.out.println("evensum="+evenSum);
		System.out.println("oddsum="+oddSum);
		System.out.println(oddSum+evenSum);
	}

}
