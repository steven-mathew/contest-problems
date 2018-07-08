package DMOJ;

import java.util.Scanner;

public class CCCHappyOrSad {

	public static void main(String[] args) {

		String str = null;

		Scanner sc = new Scanner(System.in);

		int pos = 0;
		int neg = 0;

		try {
			
			str = sc.nextLine();

			for (int i = 0; i < str.length() - 2; i++)
			{
				if (str.substring(i, i + 3).equals(":-)"))
				{
					pos++;
				}
				else if (str.substring(i, i + 3).equals(":-("))
				{
					neg++;
				}
			}

			if (pos == 0 && neg == 0)
			{
				System.out.println("none\n");
			}
			else if (pos > neg)
			{
				System.out.println("happy\n");
			}
			else if (pos < neg)
			{
				System.out.println("sad\n");
			}
			else
			{
				System.out.println("unsure\n");
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
