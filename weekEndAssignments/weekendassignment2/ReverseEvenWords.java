package weekendassignment2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";

		String arr[] = test.split(" ");

		for (int i = 0; i < arr.length; i++) {

			String str = "";
			if (i % 2 != 0) {
				for (int j = arr[i].length() - 1; j >= 0; j--) {
					str = str + arr[i].charAt(j);
				}
				arr[i] = str;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
