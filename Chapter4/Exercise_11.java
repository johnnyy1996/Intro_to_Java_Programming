/*
(Decimal to hex)
Write a program that prompts the user to enter an integer between
0 and 15 and displays its corresponding hex number.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_11{
	public static void main(String[] args){
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter an integer between 0 and 15
		System.out.print("Enter a decimal value between 0 and  15): ");
		//assign value to the int decimal
		int decimal = input.nextInt();

		//display its corresponding hex number
		//or display "invalid" message
		if (decimal >= 0 && decimal <= 9)
			System.out.println("The hex value is " + decimal);
		else if (decimal >= 10 && decimal <= 15)
			System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
		else
			System.out.println(decimal + " is an invalid input");
	}
}
