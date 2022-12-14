package buclesDavid;

import java.util.Scanner;

public class sumaParellsSenars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int num;
		int parells = 0;
		int senars = 0;

		for (int i = 0; i < times; i++) {
			num = sc.nextInt();
			for (int ii = 1; ii < num + 1; ii++) {
				if (ii % 2 == 0) {
					parells += ii;
				} else {
					senars += ii;
				}
			}
			System.out.println("PARELLS: " + parells + " SENARS: " + senars);
			parells = 0;
			senars = 0;
		}
		sc.close();
	}
}
