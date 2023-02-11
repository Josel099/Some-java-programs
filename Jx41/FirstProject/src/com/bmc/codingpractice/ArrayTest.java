package com.bmc.codingpractice;

public class ArrayTest {

	
	
	
	
	
	public static void main(String[] args) {
			int largestNumber=Integer.MIN_VALUE;
		int arr[]= {30,90,40,60,70};
		for(int i=0;i<arr.length;i++) {
			
			if(largestNumber<arr[i]) {
				largestNumber=arr[i];
			}
			
		}
		System.out.println("largest number:"+largestNumber);

	}

	
	
}
