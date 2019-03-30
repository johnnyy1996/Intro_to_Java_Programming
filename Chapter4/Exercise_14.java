/*
(Convert letter grade to number)
Write a program that prompts the user to enter a
letter grade A, B, C, D, or F and
displays its corresponding numeric value 4, 3, 2, 1, or 0.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_14 {
	public static void main(String[] args) {
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a letter grade A, B, C, D or F
		System.out.print("Enter a letter grade: ");
		//assign appropriate values to str and ch
		String str = input.nextLine();
		char ch = str.charAt(0);
		ch = Character.toUpperCase(ch);
		
		//check for valid input and display appropriate message
		//else, print "invalid" input message
		if (ch >= 'A' && ch <= 'F' && ch != 'E')
		{
			System.out.print("The numeric value for grade " + ch + " is ");
			switch(ch)
			{
				case 'A': System.out.println(4); break;
				case 'B': System.out.println(3); break;
				case 'C': System.out.println(2); break;
				case 'D': System.out.println(1); break;
				case 'F': System.out.println(0); 
			}
		}
		else
			System.out.println(ch + " is an invalid grade");
	}
}
