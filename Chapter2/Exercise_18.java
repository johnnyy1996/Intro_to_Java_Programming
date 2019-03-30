/*

*/

public class Exercise_18{

	public static void main(String[] args){

		System.out.println("a	b	pow(a, b)");

		int a, b, pow;

		for(int i = 1; i <= 5; i++){
			a = i;
			b = a + 1;
			pow = (int)Math.pow(a, b);
			System.out.println(a + "	" + b +  "	" + pow);
		}
	}
}
