package buclesDavid;

import java.util.Scanner;

public class explosioArcana2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int hp = sc.nextInt();
		int c = 0;
		int d = a;
		int times = 1;

		while (hp > 0) {
			d = a*times;
			c += d;
			times += 1;
			hp -= c;
		}
		System.out.println(times);

		sc.close();
	}
}