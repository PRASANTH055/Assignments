package week3Day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(a);
		int length = a.length;
		System.out.println(a[length - 2]);

	}

}
