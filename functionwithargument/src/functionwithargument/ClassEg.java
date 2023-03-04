package functionwithargument;


public class ClassEg {

		public static void main(String ar[])
		{
			//Sample s1=new Sample();
			//Sample s2=new Sample();
			Sample s=new Sample();
			Sample s1=new Sample();
		    int num1=1;
			 int num2=4;
			 int num3=5;
			 int num4=34;
			 
			
			//s1.CalculateSum();
			s.CalculateSum(num1,num2);
			//s2.display();
			s1.CalculateSum(num3, num4);
			s.display();
			//s1.display();
			
		}

	}


