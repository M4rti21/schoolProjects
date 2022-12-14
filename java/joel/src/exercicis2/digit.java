package exercicis2;

import java.util.Scanner;
import java.math.*;

public class digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String numString1 = String.valueOf(num); // PASEM EL INT A STRING
		char firstChar1 = numString1.charAt(0); // AGAFEM EL PERIMER CHART DE L'STRING
		String firstCharString1 = String.valueOf(firstChar1); // CONVERTIM EL CHAR EN STRING
		int firstNum1 = Integer.parseInt(firstCharString1); // CONVERTIM EL STRING EN INT

		// REPETIM EL PROCES AMB EL 2 NUMERO

		int num2 = sc.nextInt();

		String numString2 = String.valueOf(num2); // PASEM EL INT A STRING
		char firstChar2 = numString2.charAt(0); // AGAFEM EL PERIMER CHART DE L'STRING
		String firstCharString2 = String.valueOf(firstChar2); // CONVERTIM EL CHAR EN STRING
		int firstNum2 = Integer.parseInt(firstCharString2); // CONVERTIM EL STRING EN INT

		// System.out.println(firstNum1);
		// System.out.println(firstNum2);

		if (firstNum1 > firstNum2) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
