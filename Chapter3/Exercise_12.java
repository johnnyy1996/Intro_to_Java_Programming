/*

*/
import java.util.Scanner;

public class Exercise_12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();

		int number1 = number / 100;
		int remainder = number % 100;
		int number2 = remainder / 10;
		remainder %= 10;
		int number3 = remainder;

		if (number1 == number3)
			System.out.println(number + " is a palindrome");
		else
			System.out.println( number + " is not a palindrome");
	}
}
