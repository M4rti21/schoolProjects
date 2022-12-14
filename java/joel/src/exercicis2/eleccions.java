package exercicis2;
import java.util.Scanner;

public class eleccions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jiden = sc.nextInt();
		int drump = sc.nextInt();
		
		if (jiden > drump) {
			System.out.println("Jiden");
		} else {
			System.out.println("Drump");
		}
	}
}
