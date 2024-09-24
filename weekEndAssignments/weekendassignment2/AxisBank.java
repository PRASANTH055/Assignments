package weekendassignment2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Amount has been Deposited");
	}

	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();

	}

}
