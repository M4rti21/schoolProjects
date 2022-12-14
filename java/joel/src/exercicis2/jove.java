package exercicis2;
import java.util.Scanner;

public class jove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		int p4 = sc.nextInt();
		int p5 = sc.nextInt();
		int joves = 0;

		if (p1 < 30) {
			joves = joves + 1;
		}
		if (p2 < 30) {
			joves = joves + 1;
		}
		if (p3 < 30) {
			joves = joves + 1;
		}
		if (p4 < 30) {
			joves = joves + 1;
		}
		if (p5 < 30) {
			joves = joves + 1;
		}
		System.out.println(joves);
	}
}