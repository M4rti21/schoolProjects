package buclesAmbContador;

import java.util.Locale;
import java.util.Scanner;

public class CasaGran {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		String nom1 = sc.nextLine();
		int n1p = sc.nextInt();
		double n1a = sc.nextDouble();
		double n1b = sc.nextDouble();
		sc.nextLine();
		String nom2 = sc.nextLine();
		int n2p = sc.nextInt();
		double n2a = sc.nextDouble();
		double n2b = sc.nextDouble();
		double m1 = n1a * n1b * n1p;
		double m2 = n2a * n2b * n2p;
        if (m1 > m2) System.out.println(nom1);
        else if (m2 > m1) System.out.println(nom2);
        else System.out.println("Les dues cases son igual de grans");
		sc.close();
	}
}
