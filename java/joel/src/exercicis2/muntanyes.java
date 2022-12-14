package exercicis2;

import java.util.Scanner;

public class muntanyes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f1 = sc.nextInt();
		int f2 = sc.nextInt();
		int f3 = sc.nextInt();
		int f4 = sc.nextInt();
		int f5 = sc.nextInt();

		if (f1 < f2 && f2 > f3 && f3 < f4 && f4 > f5) {
			System.out.println("SI");
		} else if (f1 > f2 && f2 < f3 && f3 > f4 && f4 < f5) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}