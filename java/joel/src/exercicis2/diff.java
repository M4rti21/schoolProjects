package exercicis2;

import java.util.Scanner;

public class diff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int dif = 0;

		int g;
		int p;

		// BUSQUEM EL MES GRAN
		if (a >= b && a >= c) {
			g = a;
		} else if (b >= a && b >= c) {
			g = b;
		} else {
			g = c;
		}

		// BUSQUEM EL MES PETIT
		if (a <= b && a <= c) {
			p = a;
		} else if (b <= a && b <= c) {
			p = b;
		} else {
			p = c;
		}
		// System.out.println(p);
		// System.out.println(g);
		System.out.println(g - p);
	}

}
