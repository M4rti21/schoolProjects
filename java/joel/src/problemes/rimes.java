package problemes;

import java.util.Scanner;

public class rimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		String rima = "";
		String text = "";
		String a = "";
		String b = "";
		boolean comma = false;
		boolean rim = false;
		boolean rimsig = true;
		for (int i = 0; i < times; i++) {
			text = sc.nextLine();
			for (int j = 0; j < text.length(); j++) {
				if (comma) {
					b = text.charAt(j) + b;
				} else {
					if (text.charAt(j) == ',') {
						comma = true;
					} else a = text.charAt(j) + a;
				}
			}
			if (a.length() > b.length()) {
				for (int j = 0; j < b.length(); j++) {
					if (rim == true && rimsig == true && a.charAt(j) != b.charAt(j)) {
						rimsig = false;
					} else if (a.charAt(j) == b.charAt(j) && rimsig) {
						rima = b.charAt(j) + rima;
						rim = true;
					}
				}
			} else {
				for (int j = 0; j < a.length(); j++) {
					if (rim == true && rimsig == true && a.charAt(j) != b.charAt(j)) {
						rimsig = false;
					} else if (a.charAt(j) == b.charAt(j) && rimsig) {
						rima = b.charAt(j) + rima;
						rim = true;
					}
				}
			}
			if (rim) System.out.println(rima);
			else System.out.println("#");
			a = "";
			b = "";
			text = "";
			rima = "";
			comma = false;
			rim = false;
			rimsig = true;
		}		
		sc.close();
	}
}