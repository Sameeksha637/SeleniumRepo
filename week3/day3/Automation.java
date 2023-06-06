package week3.day3;

//It is a concrete class that contains all unimplemented methods
public class Automation extends MultipleLanguage  {

	public static void main(String[] args) {
		
		Automation a = new Automation();
		a.Java();
		a.python();
		a.ruby();
		a.Selenium();
		

	}

	@Override
	public void Java() {
		
		System.out.println("JAVA");
		
	}

	@Override
	public void ruby() {
		
		System.out.println("RUBY");
		
	}

	@Override
	public void Selenium() {
		
		System.out.println("SELENIUM");
		
	}

	
	

}
