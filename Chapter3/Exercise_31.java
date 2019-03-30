/*

*/
import java.util.Scanner;

public class Exercise_31{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int conversion = input.nextInt();

		double conversionTotal;

		if(conversion == 0){
			System.out.print("Enter the dollar amount: ");
			double dollarAmount = input.nextDouble();
			conversionTotal = dollarAmount * exchangeRate;		
			System.out.println("$" + dollarAmount + " is " + conversionTotal + " yuan");
		}
		else if(conversion == 1){
			System.out.print("Enter the RBM amount: ");
			double RBMAmount = input.nextDouble();
			conversionTotal = RBMAmount / exchangeRate;
			System.out.println(RBMAmount + " yuan is $" + conversionTotal);
		}
		else
			System.out.println("Incorrect input");
	}
}
