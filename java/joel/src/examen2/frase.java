package examen2;

import java.util.Scanner;

public class frase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		String text;
		for (int i = 0; i < times; i++) {
			text = sc.nextLine();
			sc.nextLine();
			String[] words = text.trim().split("\\s+");
			System.out.println(words.length);
		}
		sc.close();
	}
}