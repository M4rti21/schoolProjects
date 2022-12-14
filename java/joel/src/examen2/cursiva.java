package examen2;

import java.util.Scanner;

public class cursiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		boolean curs = false;
		if (text.charAt(0) == '*' && text.charAt(text.length()-1) == '*' ) {
			curs = true;
		}
		for (int i = 1; i < text.length()-1; i++) {
			if (text.charAt(i) == '*') {
				curs = false;
			}
		}
		if (curs == true) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
