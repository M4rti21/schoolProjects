package problemes;

import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a >= b) {
			for (int i = a; i >= b; i--) {
			System.out.println(i);
			}
		} else System.out.println("El segon numero no es mes petit que el primer");
		sc.close();
	}
}