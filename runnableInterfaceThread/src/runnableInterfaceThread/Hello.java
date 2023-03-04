package runnableInterfaceThread ;

public class Hello {
	public static void main(String[] args) {
		
		SampleThread st1=new SampleThread(1);
		SampleThread st2=new SampleThread(2);
		SampleThread st3=new SampleThread(3);
		
		Thread t1= new Thread(st1);
		Thread t2= new Thread(st2);
		Thread t3= new Thread(st3); 
		
		t1.start();
		t2.start();
		t3.start();
	}

}
