package examen;

import java.util.Scanner;

public class baldufa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pwr = sc.nextInt();
		int gir = pwr * 40;
		while(gir > 359) {
			gir -= 360;
		}
		
		if (gir >= 0 && gir <= 170) {
			System.out.println("BLAU");
		} else {
			System.out.println("BLANC");
		}
		
		sc.close();
	}
}
