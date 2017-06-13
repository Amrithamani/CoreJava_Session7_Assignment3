package session7;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing String variable name

		String name = "Amritha Kaushik";

		// initializing scanner input using object

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the substring");
		// prints Enter the substring

		String subName = s.nextLine();// getting String input

		s.close();// closing Scanner object

		// initializing integer variable

		int j = 0;

		// initializing String temporary variable
		String temp = "";

		// loop to check name substring
		for (int i = 0; i < name.length(); i++) {

			// checks value less than given length

			if (j < subName.length()) {

				// checks both string without using inbuilt functions at given
				// index

				if (name.charAt(i) == subName.charAt(j)) {

					temp += name.charAt(i);// storing value

					j++;// increasing subName index value

				}
			}
		}

		// checks temporary String is equal to user entered input

		if (temp.equals(subName)) {

			System.out.println("substring found");
			// prints substring found

		} else {

			System.out.println("substring not found");
			// prints substring not found

		}
	}

}
