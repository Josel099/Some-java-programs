package ifsample;
import java.util.Scanner;
public class IfSample {
public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a number");
	
	int a =sc.nextInt();
	if(a<0) {
		System.out.println("negative number");
	}
	else if(a>0) {
		System.out.println("positive number");
	}
	else 
		System.out.println("zero");
}
}
