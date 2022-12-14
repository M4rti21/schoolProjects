package exercicis2;
import java.util.Scanner;

public class carmels2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carmels = sc.nextInt();
		int nens = sc.nextInt();
		
		int sobra = carmels%nens;
		System.out.println(sobra);
		sc.close();
	}
}