package com.bmc.codingpractice;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
		
		int arr[]= {10,10,10,10,10,20,30,30,30,30,20,10,10,10,10,10,40,50,20,10};
		int duplicate=0;
		for (int j=0;j< arr.length;j++) {
			
		for(int i= j+1; i <arr.length-1;i++) {
			if(duplicate==arr[i]) {
				break;
			}
			 else if(arr[j]==arr[i]) {
				 
				duplicate=arr[i];
				
				System.out.println(arr[i]);
				break;
			}
			
		}}

	}

}
dssww