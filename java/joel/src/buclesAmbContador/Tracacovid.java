package buclesAmbContador;

import java.util.Scanner;

public class Tracacovid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int a;
		int b;
		boolean good = true;
		int i;
		int j;
		for (i = 0; i < times; i++) {
			a = sc.nextInt();
			for (j = 0; j < a; j++) {
				b = sc.nextInt();
				if (b >= 300) good = false;
			}
			if (good == true) System.out.println("OK");
			else System.out.println("ALARMA");
			good = true;
		}
		sc.close();
	}
}
