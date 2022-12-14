package buclesDavid;

import java.util.Scanner;

public class harrison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diners = sc.nextInt();
		int mill = diners / 1000000;

		for (int ii = 1; ii < (mill + 1); ii++) {
			System.out.println(ii + "000000");
		}
		sc.close();
	}
}
