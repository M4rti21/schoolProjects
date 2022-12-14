package exercicis2;
import java.util.Scanner;

public class exes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ex1 = sc.nextInt();
		int ex2 = sc.nextInt();
		int ex3 = sc.nextInt();
		int ex4 = sc.nextInt();
		
		if (ex1 < 18) {
			System.out.println("NO");
		} else if (ex2 == ex1) {
			System.out.println("NO");
		} else if (ex3 == ex1 || ex3 == ex2) {
			System.out.println("NO");
		} else if (ex4 == ex3 || ex4 == ex2 || ex4 == ex1) {
			System.out.println("NO");
		} else {
			System.out.println("SI");
		}
		
	}

}
