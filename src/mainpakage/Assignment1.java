package mainpakage;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("please enter word to check:");
		Scanner inScanner = new Scanner(System.in);
		String str = inScanner.next();
		String sWfCh = str.substring(1);
		if (Character.isLowerCase(str.charAt(0))) { // small
			if (sWfCh.equals(sWfCh.toUpperCase())) // capital
			{
				System.out.print(Character.toUpperCase(str.charAt(0)));
				System.out.println(sWfCh.toLowerCase());
			} else
				System.out.println(str);
		} else // capital

		if (sWfCh.equals(sWfCh.toUpperCase())) // capital
			System.out.println(str.toLowerCase());
		else
			System.out.println(str);

		inScanner.close();
	}

}
