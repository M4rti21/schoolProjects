package examen2;

import java.util.Scanner;

public class tisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tir;
		int p1p = 3;

		while (p1p > 0 && p1p < 6) {
			tir = sc.nextLine();
			if (tir.charAt(0) == '1' && tir.charAt(2) == '3') {
				p1p += 1;
			} else if (tir.charAt(0) == '1' && tir.charAt(2) == '2') {
				p1p -= 1;
			} else if (tir.charAt(0) == '2' && tir.charAt(2) == '1') {
				p1p += 1;
			} else if (tir.charAt(0) == '2' && tir.charAt(2) == '3') {
				p1p -= 1;
			} else if (tir.charAt(0) == '3' && tir.charAt(2) == '2') {
				p1p += 1;
			} else if (tir.charAt(0) == '3' && tir.charAt(2) == '1') {
				p1p -= 1;
			}
		}
		if (p1p == 0) {
			System.out.println("PERD");
		} else {
			System.out.println("GUANYA");
		}
		sc.close();
	}
}
