package com.bmc.codingpractice;

public class SecondSmallest {

	public static void main(String[] args) {
		int smallestNumber=Integer.MAX_VALUE;
		//int secondLargest=0;
		int secondSmallest=Integer.MAX_VALUE;
	int arr[]= {30,90,40,85,60,70};
	for(int i=0;i<arr.length;i++) {
		
		if(smallestNumber>arr[i]) {
			secondSmallest=smallestNumber;
			smallestNumber=arr[i];
		}
		else if(secondSmallest>arr[i])
		{
			secondSmallest=arr[i];
		}
	}
	System.out.println("second Smallest number:"+ secondSmallest);
	System.out.println(" Smallest number:"+ smallestNumber);

	}

}
