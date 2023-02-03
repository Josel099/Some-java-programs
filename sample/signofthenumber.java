

import java.util.Scanner;

public class signofthenumber {
    public static void main(String ar[]){

        System.out.println("enter the number");
        try (Scanner s = new Scanner(System.in)) {
            int a=s.nextInt();
            if(0<a)
                System.out.println("it is positive number");
                else if(a==0)
                System.out.println("it is zero");
                else 
                System.out.println("it is negative number");
        }

        

    }
}
