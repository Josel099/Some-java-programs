package abstractSample;  
													// this is file is developed by the library developeres
public class TextScanner {
	
	Hello obj;															// instance variable
	public TextScanner(Hello obj) {	//constructor // it has an argument it is  obj of  class	Hello
		
		this.obj=obj;	// passing obj value to global variable
		
	}

		void Scan() {
						// lines of code for scanning  the text
			
			obj.onText(" scanned text"); // ontext() is a function in class Hello .  // scanned text - it's the scanned text from the camera
		}
	
}
