package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemNum = scan.nextInt();
		String[] nameArr = new String[itemNum];
		double[] priceArr = new double[itemNum];
		for(int i = 0; i < itemNum; i++)
		{
		String itemName = scan.next();
		double itemPrice = scan.nextDouble();
		nameArr[i] = itemName;
		priceArr[i] = itemPrice;
		}
		int customerNum = scan.nextInt();
		String largeFirst = "";
		String largeLast = "";
		String smallFirst = "";
		String smallLast = "";
		double largeTotal = 0.0;
		double smallTotal = 9999999.99;
		double grandTotal = 0.0;
		
		for(int i = 0; i < customerNum; i++)
		{
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCount = scan.nextInt();
			double total = 0.0;
			for (int j = 0; j < itemCount; j++)
			{
				int quant = scan.nextInt();
				String name = scan.next();
				for (int k = 0; k < priceArr.length; k++)
				{
				if (name == nameArr[k])
				{
					total += quant * priceArr[k];
				}
				}
		}
			grandTotal += total;
			if (total >= largeTotal)
			{
				largeTotal = total;
				largeFirst = firstName;
				largeLast = lastName;
			}
			if (total <= smallTotal)
			{
				smallTotal = total;
				smallFirst = firstName;
				smallLast = lastName;
			}
		}
		double average = grandTotal / customerNum;
		String largeStr = String.format("%.2f", largeTotal);
		String smallStr = String.format("%.2f", smallTotal);
		String avgStr = String.format("%.2f", average);
		System.out.println("Biggest: " + largeFirst + " " + largeLast + " (" + largeStr + ")");
		System.out.println("Smallest: " + smallFirst + " " + smallLast + " (" + smallStr + ")");
		System.out.println("Average: " + avgStr);
		scan.close();
		
	}
}
