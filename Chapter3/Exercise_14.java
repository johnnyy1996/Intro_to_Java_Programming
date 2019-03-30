/*

*/
import java.util.Scanner;

public class Exercise_14{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 0 for heads or 1 for tails: ");
        	int userGuess = input.nextInt();

        	int coinSide = (int) (Math.random() * 2.0);

        	if (userGuess == coinSide)
            		System.out.println("You guessed correctly!");
        	else if (coinSide == 0)
            		System.out.println("It's heads");
        	else 
            		System.out.println("It's tails");
    	}
}
