package buclesAmbContador;

import java.util.Scanner;

public class Banana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int hp = 0;
		int dmg = 0;
		for (int i = 0; i < times; i++) {
			hp = sc.nextInt();
			dmg = sc.nextInt();
			if (dmg >= hp) System.out.println("Nope");
			else if (dmg > (hp*0.2)) System.out.println("Momento Banana");
			else System.out.println("Nope");
		}
		sc.close();
	}
}
