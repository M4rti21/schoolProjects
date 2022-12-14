package exercicis2;
import java.util.Scanner;

public class divisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r1 = (n % 1);
		int r2 = (n % 2);
		int r3 = (n % 3);
		int r4 = (n % 4);
		int r5 = (n % 5);
		int r6 = (n % 5);
		int r7 = (n % 5);
		int r8 = (n % 5);
		int r9 = (n % 5);
		
		int rs = r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 + r9;
		
		switch (rs) {
		
		case 0:
			System.out.println("SI");
			break;
		default:
			System.out.println("NO");
			break;
		}
		
	}

}
