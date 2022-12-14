package buclesDavid;

import java.util.Scanner;

public class explosioArcana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = a;

		for (int i = 1; i < b +1; i++) {
			d = a*i;
			c += d;
			//System.out.println("d: " + d);
			//System.out.println("c: " + c);
		}
		System.out.println(c);

		sc.close();
	}
}