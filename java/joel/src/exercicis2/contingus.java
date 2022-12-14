package exercicis2;
import java.util.Scanner;

public class contingus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num2 == (num1+1) || num2 == (num1-1)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}