package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemNum = scan.nextInt();
		String[] nameArr = new String[itemNum];
		int[] custNumArr = new int[itemNum];
		int[] numArr = new int[itemNum];
		for(int i = 0; i < itemNum; i++)
		{
		String itemName = scan.next();
		scan.nextDouble();
		nameArr[i] = itemName;
		}
		int customerNum = scan.nextInt();
		for(int i = 0; i < customerNum; i++)
		{
			scan.next();
			scan.next();
			int itemCount = scan.nextInt();
			String lastName = "";
			int lastIndex = 0;
			for (int j = 0; j < itemCount; j++)
			{
				
				int quant = scan.nextInt();
				String name = scan.next();
				if (name.equals(lastName))
				{
					numArr[lastIndex] += quant;
				}
				for (int k = 0; k < nameArr.length; k++)
				{
				if (name.equals(nameArr[k]))
				{
					custNumArr[k] += 1;
					numArr[k] += quant;
					lastName = name;
					lastIndex = k;
				}
			}
		}

		}
		for (int i = 0; i < nameArr.length; i++)
		{
			if (custNumArr[i] == 0)
			{
				System.out.println("No customers bought " + nameArr[i]);
			}
			else if (custNumArr[i] != 0)
			{
				System.out.println(custNumArr[i] + " customers bought " + numArr[i] + " " + nameArr[i]);
			}
		}
		scan.close();
	}
}
