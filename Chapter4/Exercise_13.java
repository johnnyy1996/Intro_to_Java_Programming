/*
(Vowel or consonant?)
Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_13{
	public static void main(String[] args){
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a letter
		System.out.print("Enter a letter: ");
		//assign appropriate values to str and ch
		String str = input.nextLine();
		char ch = str.charAt(0);

		//display appropriate message
		//vowel, consonant, or invalid input
		if (Character.isLetter(ch)){
			switch(Character.toUpperCase(ch)){
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(ch + " is a vowel"); break;
				default : System.out.println(ch + " is a consonant"); 
			}
		}
		else
			System.out.println(ch + " is an invalid input");
	}
}
