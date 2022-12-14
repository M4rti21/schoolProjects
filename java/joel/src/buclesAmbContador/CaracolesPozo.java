package buclesAmbContador;

import java.util.Scanner;

public class CaracolesPozo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int pou = 0;
		int dia = 0;
		int nit = 0;
		int durada = 0;
		boolean out = false;
		for (int i = 0; i < times; i++) {
			pou = sc.nextInt();
			dia = sc.nextInt();
			nit = sc.nextInt();
			if (nit >= dia && dia < pou) System.out.println("NO");
			else if (dia == 0) System.out.println("NO");
			else while (out != true) {
				pou -= dia;
				durada++;
				if (pou <= 0) out = true;
				else pou+=nit;
			}
			if (out) System.out.println(durada);
			out = false;
			durada = 0;
		}
		sc.close();
	}
}
