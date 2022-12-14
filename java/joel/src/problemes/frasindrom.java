package problemes;

import java.util.Scanner;

public class frasindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		boolean good = false;
		while (!text.equals(".")) {
			String[] words = text.trim().split("\\s+");
			if (words.length % 2 == 0) {
				for (int i = 0; i < words.length / 2; i++) {
					if (words[i] == words[words.length -1 - i])
						good = true;
				}
			} else {
				for (int i = 0; i < words.length - words.length / 2; i++) {
					if (words[i] == words[words.length - 1 - i])
						good = true;
				}
			}
			if (good)
				System.out.println("SI");
			else
				System.out.println("NO");
			good = false;
			text = sc.nextLine();
		}
		sc.close();
	}
}