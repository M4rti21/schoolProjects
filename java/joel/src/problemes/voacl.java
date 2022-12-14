package problemes;

import java.util.Scanner;

public class voacl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		String text;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0; 
		int u = 0;
		for (int l = 0; l < times; l++) {
			text = sc.nextLine();
			text = text.toLowerCase();
			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(j) == 'a') a++;
				else if (text.charAt(j) == 'e') e++;
				else if (text.charAt(j) == 'i') i++;
				else if (text.charAt(j) == 'o') o++;
				else if (text.charAt(j) == 'u') u++;
			}
			if (a > e && a > i && a > o && a > u) System.out.println("Vocal guanyadora: a");
			else if (e > i && e > o && e > u) System.out.println("Vocal guanyadora: e");
			else if (i > o && i > u) System.out.println("Vocal guanyadora: i");
			else if (o > u) System.out.println("Vocal guanyadora: o");
			else System.out.println("Vocal guanyadora: u");
			a = 0;
			e = 0;
			i = 0;
			o = 0; 
			u = 0;
		}
		sc.close();
	}
}