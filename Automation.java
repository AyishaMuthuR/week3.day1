package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool{

	

	@Override
	public void ruby() {
		System.out.println("Ruby is a growing language to be used for testing");
		
	}

	public void selenium() {
		System.out.println("Selenium is the most preferred tool for Automation testing");
		
	}

	public void java() {
		System.out.println("Java is the Motherhood of Selenium");
		
	}
   public static void main(String[] args) {
		Automation lng=new Automation();
		lng.java();
		lng.selenium();
		lng.python();
		lng.ruby();
      
	   
	}

}
