package exercicis2;
import java.util.Scanner;

public class compteEnrere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while (num >= 0) {
			System.out.println(num);
			num = num -1;
		}
		sc.close();
	}
}
