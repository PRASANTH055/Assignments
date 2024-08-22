package week1.day1;

public class Student {

	public void playing() {
		System.out.println("playing cricket");
	}

	public void learning() {
		System.out.println("learning new things");
	}

	public void writing() {
		System.out.println("write the examination");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.playing();
		obj.learning();
		obj.writing();
	}

}
