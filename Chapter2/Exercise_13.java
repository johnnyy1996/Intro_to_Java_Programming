/*

*/
import java.util.Scanner;

public class Exercise_13{


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double monthlyAmount = input.nextDouble();
		double total = 0;

		for(int i = 0; i < 6; i++)
			total = (monthlyAmount + total) * (1 + 0.00417);

		System.out.println("After the sixth mnth, the account value is $" + total);
	}
}
