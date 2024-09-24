package weekendassignment2;

public class Automation extends MultipleLanguage implements Language,TestTool{

	@Override
	public void ruby() {
       System.out.println("program");		
	}

	@Override
	public void Selenium() {
      System.out.println("Testing Tool");		
	}

	@Override
	public void java() {
     System.out.println("Common Language");		
	}
	public static void main(String[] args) {
		Automation a=new Automation();
		a.ruby();
		a.Selenium();
		a.java();
	}
	

}
