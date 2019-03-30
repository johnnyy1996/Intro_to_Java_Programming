/*

*/
import java.util.Scanner;

public class Exercise_18 {
	public static void main(String[] strings) {
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter the weight: ");
        	double weight = input.nextDouble();

		if (weight > 50) {
        		System.out.println("The package cannot be shipped.");
              		System.exit(0);
       		} 
		else if (weight < 0) {
              		System.out.println("Invalid Weight!");
              		System.exit(1);
      		}

		double cost;

		if (weight <= 1)
			cost = 3.5;
		else if (weight <= 3)
			cost = 5.5;
		else if (weight <= 10)
			cost = 8.5;
		else
			cost = 10.5;

        	double totalCost = cost * weight;
        	System.out.print("The cost is: $" + totalCost);
	}
}
