package exercicis2;
import java.util.Scanner;

public class jove2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 30) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}
