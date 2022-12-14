package exercicis2;
import java.util.Scanner;

public class carmels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carmels = sc.nextInt();
		int nens = sc.nextInt();
		
		if (nens == 0) {
			System.out.println(nens);
		} else {
			System.out.println(carmels/nens);
		}
		sc.close();
	}
}