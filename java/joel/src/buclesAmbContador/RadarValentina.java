package buclesAmbContador;

import java.util.Scanner;

public class RadarValentina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int en = 0;
		int a = 0;
		int i;
		int j;
		for (i = 0; i < times; i++) {
			for (j = 0; j < 5; j++) {
				en = sc.nextInt();
				if (a < en) a = en;
			}
			if (a >= 10000) System.out.println("M");
			else if (a >= 1000) System.out.println("B");
			else System.out.println("H");
			a = 0;
		}
		sc.close();
	}
}
