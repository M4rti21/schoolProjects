package examen2;

import java.util.Scanner;

public class eleccions2020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		int jiden = 0;
		int drump = 0;
		boolean sw = false;
		while (sw == false) {
			text = sc.nextLine();
			if (text.equals("JIDEN")) {
				jiden += 1;
			} else if (text.equals("DRUMP")) {
				drump += 1;
			}
			if (jiden > 2 || drump > 4) {
				sw = true;
			}
		}
		
		if (jiden == 3) {
			System.out.println("Ha guanyat JIDEN");
		} else {
			System.out.println("Ha guanyat DRUMP");
		}
		sc.close();
	}
}
