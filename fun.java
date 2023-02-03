import java.util.Scanner;

public class fun {
    
    public static void main(String ar[]){
        // it's a program with function with argument and with return value

    System.out.println("enter two numbers:");
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int result=sum(a,b);
      System.out.println("sum="+result);
    }
    /**
     * @param d
     * @param e
     * @return
     */
    static int sum( int d, int e){
        final int r=d+e;
        return r;

    }
    
    
    

        


    }

