package buclesDavid;

import java.util.Scanner;

public class producteNumerosNat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int num;
		long producte = 1;

		for (int i = 0; i < times; i++) {
			num = sc.nextInt();
			for (int iii = 1; iii < num + 1; iii++) {
				producte *= iii;
			}
			System.out.println(producte);
			producte = 1;
		}
		sc.close();
	}
}
