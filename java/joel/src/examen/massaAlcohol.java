package examen;

import java.util.Scanner;

public class massaAlcohol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a >= 21 && b >= 21 && c >= 21) {
			System.out.println("BORRATXOS");
		} else if (a >= 21 || b >= 21 || c >= 21) {
			System.out.println("AMB ALCOHOL FORT");
		} else if (a >= 18 || b >= 18 || c >= 18) {
			System.out.println("AMB ALCOHOL");
		} else {
			System.out.println("SENSE ALCOHOL");
		}
		sc.close();
	}

}
