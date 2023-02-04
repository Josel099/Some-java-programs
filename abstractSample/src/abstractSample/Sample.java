package abstractSample;			// this is the class where user have

public  class  Sample extends Hello {

	void onText(String text) {     // defining the abstract method	// automaticaly call when the text is available
		
		System.out.println(text);		// printing the scanned text 
		}
	Sample(){
		TextScanner ts = new TextScanner(this ); 
		ts.Scan();
	}
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
	}
	
}
