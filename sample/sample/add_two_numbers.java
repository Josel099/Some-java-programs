package sample;
import java.util.Scanner;

public class add_two_numbers {
 
   
    public static void main(String ar[]){

        System.out.println("enter two numbers");

           try (Scanner s = new Scanner(System.in)) {
            int a=s.nextInt();
               int b=s.nextInt();
               int c=a+b;
               System.out.println("result:"+c);
        }


        }


    }


