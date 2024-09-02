package week3Day1;

public class Palindrome {

	public static void main(String[] args) {
		String a = "malayalam";
		String rev = "";
		for (int i = 0; i < a.length(); i++) {
			rev = a.charAt(i) + rev;
		}
		if (rev.equalsIgnoreCase(a)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
