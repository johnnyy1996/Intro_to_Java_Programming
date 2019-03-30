/*
Write a program that reads an integer between 0 and 1000 
and adds all the digits in the integer. For example, if 
an integer is 932, the sum of all its digits is 14.
*/

import java.util.Scanner;

public class Exercise_06{
    
	public static void main(String[] args){
        
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
                         
		int number = input.nextInt();
                         
        	int digitOne = number % 10;
        	int remainder = number / 10;
        	int digitTwo = remainder % 10;
    		remainder = remainder / 10;
    		int digitThree = remainder % 10;
                         
    		int sum = digitOne + digitTwo + digitThree;
        
    		System.out.println("The sum of the digits is " + sum);
	}
}
