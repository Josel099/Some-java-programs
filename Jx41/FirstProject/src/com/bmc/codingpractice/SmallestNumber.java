package com.bmc.codingpractice;

public class SmallestNumber {

	public static void main(String[] args) {
		
		
	int arr[]= {30,90,40,60,70};
	int smallesttNumber=Integer.MAX_VALUE;
	for( int i=0;i<arr.length;i++) {
		
		if(smallesttNumber>arr[i]) {
			smallesttNumber=arr[i];
		}
		
	}
	System.out.println("smallest tNumber:"+smallesttNumber);

}

}

