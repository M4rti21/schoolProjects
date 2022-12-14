package examen2;

import java.util.Scanner;

public class pintar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		int cara = 0;
		int creu = 0;
		boolean sw = false;
		while (sw == false) {
			text = sc.nextLine().toUpperCase();
			if (text.equals("CARA")) {
				cara += 1;
			} else if (text.equals("CREU")) {
				creu += 1;
			} else if (text.equals("TERRA")) {
				sw = true;
			}
		}
		
		if (cara > creu) {
			System.out.println("JAN");
		} else if (creu > cara) {
			System.out.println("JOFRE");
		} else {
			System.out.println("NO ES PINTA");
		}
		sc.close();
	}
}
