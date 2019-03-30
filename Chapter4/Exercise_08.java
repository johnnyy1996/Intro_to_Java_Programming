/*
(Find the character of an ASCII code)
Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_08{
	public static void main(String[] args){
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter an ASCII code
		//assign value to the int code
		System.out.print("Enter an ASCII code: ");
		int code = input.nextInt();

		//display ASCII code as character
		System.out.println((char)code);
	}
}
