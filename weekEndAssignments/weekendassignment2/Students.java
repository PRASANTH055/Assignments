package weekendassignment2;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(String name) {
		  System.out.println(name);
	}
	public void getStudentInfo(String email,int a) {
		  System.out.println(email+a);
	}
	public void getStudentInfo(long PhoneNumber) {
		System.out.println(PhoneNumber);
	}

	public static void main(String[] args) {
       Students obj=new Students();
       obj.getStudentInfo(55);
       obj.getStudentInfo("Prasanth");
       obj.getStudentInfo("prasanth@gamil.com", 07);
       obj.getStudentInfo(9944361732l);
	}

}
