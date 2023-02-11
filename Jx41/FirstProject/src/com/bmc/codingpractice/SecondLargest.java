package com.bmc.codingpractice;

public class SecondLargest {

	public static void main(String[] args) {
		
		
			int largestNumber=Integer.MIN_VALUE;
			//int secondLargest=0;
			int secondLargest=Integer.MIN_VALUE;
		int arr[]= {30,90,40,85,60,70};
		for(int i=0;i<arr.length;i++) {
			
			if(largestNumber<arr[i]) {
				secondLargest=largestNumber;
				largestNumber=arr[i];
			}
			else if(secondLargest<arr[i])
			{
				secondLargest=arr[i];
			}
		}
		System.out.println("Second largest number:"+ secondLargest);

	}

	
	


	}


