package weekendassignment2;

public class BankInfo {
	public void saving() {
		System.out.println("Saving Amount");
	}
	public void fixed() {
		System.out.println("Amount has been fixed");
	}
	public void deposit() {
		System.out.println(50000);
	}

	public static void main(String[] args) {
      BankInfo obj=new BankInfo();
      obj.saving();
      obj.fixed();
      obj.deposit();
	}

}
