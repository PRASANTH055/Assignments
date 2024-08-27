package week1.day1;

public class Swapwithouttemp {

	public static void main(String[] args) {
		int a = 18;
		int b = 23;
		System.out.println("Before swaping the value of a is: " + a);
		System.out.println("Before swaping the value of a is: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swaping the value of a is:" + a);
		System.out.println("After swaping the value of a is:" + b);

	}

}
