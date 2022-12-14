package exercicis2;
import java.util.Scanner;

public class anys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num > 366 || num < 1) {
			System.out.println("Incorrecte!");
		} else if (num == 366) {
			System.out.println("Correcte per un any bixest!");
		} else {
			System.out.println("Correcte per un any no bixest!");
		}
		sc.close();
	}
}
