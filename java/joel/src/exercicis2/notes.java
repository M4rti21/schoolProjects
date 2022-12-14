package exercicis2;

import java.util.Scanner;

public class notes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String notes = sc.nextLine();

		boolean sw1 = false;
		boolean sw2 = false;
		boolean sw3 = false;

		int count = 0;

		String num1 = "";
		String num2 = "";
		String num3 = "";

		while (sw1 == false) {
			if (notes.charAt(count) != ',') {
				num1 = num1 + notes.charAt(count);
				count += 1;
				// System.out.println(num1);
			} else {
				sw1 = true;
				count += 1;
			}
		}

		while (sw2 == false) {
			if (notes.charAt(count) != ',') {
				num2 = num2 + notes.charAt(count);
				count += 1;
				// System.out.println(num2);
			} else {
				sw2 = true;
				count += 1;
			}
		}

		while (sw3 == false) {
			if (count != notes.length()) {
				num3 = num3 + notes.charAt(count);
				count += 1;
				// System.out.println(num3);
			} else {
				sw3 = true;
				count += 1;
			}
		}

		float inum1 = Float.parseFloat(num1);
		float inum2 = Float.parseFloat(num2);
		float inum3 = Float.parseFloat(num3);

		// System.out.println(inum1);
		// System.out.println(inum2);
		// System.out.println(inum3);

		float st = (inum1 * 30) / 100;
		float nd = (inum2 * 50) / 100;
		float rd = (inum3 * 20) / 100;

		// System.out.println("st " + st);
		// System.out.println("nd " + nd);
		// System.out.println("rd " + rd);

		float fin = st + nd + rd;
		// System.out.println("fin " + fin);

		if (fin < 5 || inum1 < 4 || inum2 < 4) {
			System.out.println("Suspes");
		} else if (fin >= 5 && fin <= 7) {
			System.out.println("Aprovat");
		} else if (fin > 7 && fin <= 9) {
			System.out.println("Notable");
		} else if (fin > 9) {
			System.out.println("Excel·lent");
		} else {
			System.out.println("Error");
		}

		sc.close();
	}
}
