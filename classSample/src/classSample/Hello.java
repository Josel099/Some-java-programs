package classSample;

public class Hello {
public static void main(String ar[]) {
	
	Sample s1= new Sample();
	Sample s2= new Sample();
	
	s1.a=10;
	s2.a=4;
	s1.b=45;
	s2.b=23;
	System.out.println(s1.a);
	System.out.println(s2.a);
	System.out.println(s1.b);
	System.out.println(s2.b);
	System.out.println("s2.b="+s2.b +"	s1.a="+s1.a);
	s1.display();
	s2.display();
	
	
	
}
}
