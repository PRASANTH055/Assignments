package weekendassignment2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String arr[] = text.split(" ");

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (count > 1) {
				arr[i] = " ";
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != " ") {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
