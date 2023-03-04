package runnableInterfaceThread; 
public class SampleThread implements Runnable{

	
		int a;
		SampleThread(int a){
			this.a=a;
		}
		public void run() {
			
			for(int i=0;i<10;i++)
			{
				System.out.println(a+"thread count "+i);
				try {
				Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	
}