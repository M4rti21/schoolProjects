package buclesDavid;

import java.util.Scanner;

public class aire {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		
		for (int i = 0; i < a; i++) {
			b = sc.nextInt();
			while(b > 359) {
				b-= 360;
			}
			if (b % 180 == 0) {
				System.out.println("OK");
			} else {
				System.out.println("BRONCA");
			}
		}
		sc.close();
	}
}
