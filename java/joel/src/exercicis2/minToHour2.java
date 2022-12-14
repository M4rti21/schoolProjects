package exercicis2;

import java.util.Scanner;

public class minToHour2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();

		int hh = 0;
		int mm = 0;

		hh = min / 60;
		mm = min - (hh * 60);

		System.out.println(hh + ":" + mm);
	}
}