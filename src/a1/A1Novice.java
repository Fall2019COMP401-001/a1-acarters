package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customerNum = scan.nextInt();
		for(int i = 0; i <= customerNum; i++)
		{
		String firstName = scan.next();
		char firstChar = firstName.charAt(0);
		String lastName = scan.next();
		int numOfItems = scan.nextInt();
		double total = 0.0;
		for(int j = 0; j <= numOfItems; j++)
		{
			int quant = scan.nextInt();
			scan.next();
			double price = scan.nextDouble();
			total += price * quant;
		}
		String totalStr = String.format("%.2f", total);
		System.out.println(firstChar + ". " + lastName + ": " + totalStr);
		}
		scan.close();
	}
}
