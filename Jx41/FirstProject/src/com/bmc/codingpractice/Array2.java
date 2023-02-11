package com.bmc.codingpractice;

public class Array2 {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,40,50,60,70,80,90};
		int b[]=new int[9];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}	
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
