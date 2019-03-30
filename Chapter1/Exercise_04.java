/*
(Print a table) Write a program that displays the following table:
a	 a^2    a^3
1	 1 	1
2	 4 	8
3	 9 	27
4	 16     64
*/

public class Exercise_04{
	public static void main(String[] args){
		System.out.println("a	a^2	a^3");
		for(int i = 1; i <= 4; i++)
			System.out.println(i + "	" + i * i + "	" + i * i * i);
	}
}
