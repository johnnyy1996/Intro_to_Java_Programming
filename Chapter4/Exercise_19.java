/*
(Business: check ISBN-10)
Rewrite the Programming Exercise 3.9 by entering
the ISBN number as a string.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_19 {
	public static void main(String[] args) {
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter the first 9 digits 
		System.out.print("Enter the first 9 digits of a ISBN: ");
		//assign value to the string ISBN
		String isbn = input.nextLine();

		//extract the 9 digits of the ISBN
		int d1 = Integer.parseInt(isbn.substring(0, 1));
		int d2 = Integer.parseInt(isbn.substring(1, 2));
		int d3 = Integer.parseInt(isbn.substring(2, 3));
		int d4 = Integer.parseInt(isbn.substring(3, 4));
		int d5 = Integer.parseInt(isbn.substring(4, 5));
		int d6 = Integer.parseInt(isbn.substring(5, 6));
		int d7 = Integer.parseInt(isbn.substring(6, 7));
		int d8 = Integer.parseInt(isbn.substring(7, 8));
		int d9 = Integer.parseInt(isbn.substring(8));

		//compute d10
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		//display the 10-digit ISBN
		System.out.println(
			"The ISBN-10 number is " + isbn + ((d10 == 10) ? "X" : d10));
	}
}
