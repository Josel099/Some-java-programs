package samplethread;

public class Hello {
	public static void main(String[] args) {
		
		SampleThread st1=new SampleThread(1);
		SampleThread st2=new SampleThread(2);
		SampleThread st3=new SampleThread(3);
		st1.start();
		st2.start();
		st3.start();
	}

}
