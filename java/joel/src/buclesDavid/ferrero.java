package buclesDavid;

import java.util.Scanner;

public class ferrero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		int a = sc.nextInt();
		int b;
		for (int ii = 0; ii < a; ii++) {
			b = sc.nextInt();
			for (int i = 1; i < (b+1); i++) {
				tot = tot + (i*i);
			}
			System.out.println(tot);
			tot = 0;
		}
		sc.close();
	}
}
