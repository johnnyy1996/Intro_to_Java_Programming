/*
(Phone key pads)
The international standard letter/number mapping found 
on the telephone is shown below:
Write a program that prompts the user to enter a letter
and displays its corresponding number.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_15 {
	public static void main(String[] args) {
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a letter
		System.out.print("Enter a letter: ");
		//assign appropriate values to str and ch
		String str = input.nextLine();
		char ch = str.charAt(0);
		ch = Character.toUpperCase(ch);

		//display the corresponding number
		int number = 0;
		if (Character.isLetter(ch))
		{
			if (ch >= 'W')
				number = 9;
			else if (ch >= 'T')
				number = 8;
			else if (ch >= 'P')
				number = 7;
			else if (ch >= 'M')
				number = 6;
			else if (ch >= 'J')
				number = 5;
			else if (ch >= 'G')
				number = 4;
			else if (ch >= 'D')
				number = 3;
			else if (ch >= 'A')
				number = 2;
			System.out.println("The corresponding number is " + number);
		}
		else
			System.out.println(ch + " is an invalid input");
	}
}
