package exercicis2;

import java.util.Scanner;

public class okBoomer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edat = sc.nextInt();

		if (edat > 1944 && edat < 1966) {
			System.out.println("ok boomer");

		} else {
			System.out.println("nah");
		}
	}
}