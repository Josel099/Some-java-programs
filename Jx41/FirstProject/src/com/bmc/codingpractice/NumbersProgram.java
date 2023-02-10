package com.bmc.codingpractice;

public class NumbersProgram {

	
	
	public static void main(String[] args) {
		
		int number=45678;
		
		int evenCount=0,oddCount=0;
		
		for(int i=0;i<5;i++) {
			
			int ans=number%10;
			if (ans%2 ==0) {
				evenCount++;
			}
			else if(ans%2!=0){
				oddCount++;
			}
			
			number = number/10;
		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
