package functionsample;
import java.util.Scanner;
public class FunctionSample {
public static void main(String ar[]) {
	//int sum(int,int);
	System.out.println("enter 2 numbers");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	//sum(a,b);
	//int s=0;
	System.out.println(sum(a,b));
}
	
	static int sum(int a,int b) {
		int s=a+b;
		
		
		return s;
	}
	
}
