package weekEndAssignments;

public class Palindrome {

	public static void main(String[] args) {
		String a = "madam";
		String rev = "";
		for (int i = 0; i < a.length(); i++) {
			rev = rev + a.charAt(i);
			if (rev.equals(a)) {
				System.out.println("Its an Palindrome");
			}
		}
	}

}
