package oops;

import java.util.Scanner;

class calculatesum {

    public static void main(String ar[]){

        sum obj1=new sum();
       sum obj2=new sum();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbers");
        int a=s.nextInt();
        int  b=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();


        obj1.add(a,b);
       // obj1.display();
        obj2.add(d,e);
        
    }
    
}
