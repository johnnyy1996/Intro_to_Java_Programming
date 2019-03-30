/*
(Find the Unicode of a character)
Write a program that receives a character and displays its Unicode.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_09{
	public static void main(String[] args){
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a character
		//assign value to the string str
		System.out.print("Enter a character: ");
		String str = input.nextLine();
		char ch = str.charAt(0);

		//display Unicode of character
		System.out.println((int)ch);
	}
}
