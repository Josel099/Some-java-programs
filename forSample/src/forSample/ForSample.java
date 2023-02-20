package forSample;
import java.util.Scanner;
public class ForSample {

	public static void main(String ar[]) {
		System.out.println("enter a given nummber");
		Scanner s=new Scanner(System.in);
		int sum=0;
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			 sum=sum+i;
		}
		
		System.out.println("sum="+sum);
		
	}
}
