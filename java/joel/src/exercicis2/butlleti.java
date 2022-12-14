package exercicis2;
import java.util.Scanner;

public class butlleti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		
		if (nota < 5) {
			System.out.println("Suspes");
		} else if (nota < 7) {
			System.out.println("Aprovat");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Excelent");
		}
		sc.close();
	}
}
