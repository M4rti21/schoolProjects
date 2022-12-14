package examen;
import java.util.Scanner;
public class jocDeDaus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String pos = null;
		
		if (a < 4) {
			pos = "No arribarà a 10";
		} else {
			pos = "Pot arribar a 10";
		}

		if (((a + b) % 2) == 0) {
			System.out.println(pos + " - Parell");
		} else {
			System.out.println(pos + " - Senar");
		}
		sc.close();
	}
}