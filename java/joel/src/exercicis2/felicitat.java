package exercicis2;

import java.util.Scanner;

public class felicitat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f1 = sc.nextInt();
		int f2 = sc.nextInt();
		int f3 = sc.nextInt();

		if (f1 < f2 && f2 < f3) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}
