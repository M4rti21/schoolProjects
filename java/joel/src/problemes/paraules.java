package problemes;

import java.util.Scanner;

public class paraules {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		String text;
		int par = 0;
		for (int i = 0; i < times; i++) {
			text = sc.nextLine();
			text = text.trim();
			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(j) != ' ' && text.charAt(j-1) == ' ') par++;
			}
			System.out.println(par);
			par = 0;
		}
		sc.close();
	}
}