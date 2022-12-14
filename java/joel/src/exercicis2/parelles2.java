package exercicis2;
import java.util.Scanner;

public class parelles2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a == b && b == c) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
