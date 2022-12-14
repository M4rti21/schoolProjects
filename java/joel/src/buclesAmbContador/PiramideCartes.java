package buclesAmbContador;

import java.util.Scanner;

public class PiramideCartes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int cartes = 0;
		int block = 3;
		int lastblock = 2;
		int pis = 1;
		for (int i = 0; i < times; i++) {
			cartes = sc.nextInt();
			if (cartes < lastblock) System.out.println("0 "+ cartes);
			else {
				while (cartes > ((block * pis) + (lastblock * pis+1))) {
					cartes -= block * pis;
					pis++;
				}
				cartes -= lastblock * pis;
				System.out.println(pis + " " + cartes);
				pis = 1;
			}
		}
		sc.close();
	}
}