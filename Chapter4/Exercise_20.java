/*
(Process a string)
Write a program that prompts the user to enter a string
and displays its length and its first character.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_20 {
	public static void main(String[] args) {
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a string
		System.out.print("Enter a sting: ");
		//assign value to the string str
		String str = input.nextLine();

		//display the string's length and its first character
		System.out.println(str + " has a length of " + str.length() +
		" and its first character is " + str.charAt(0));
	}
}
