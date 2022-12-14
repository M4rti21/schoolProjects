package buclesDavid;

import java.util.Scanner;

public class frases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultat = "";
		
		String text = sc.nextLine();
		while (!text.equals("FI")) {
			resultat += text.replaceAll("[^A-Za-z0-9]", "").length() + " ";
			
			text = sc.nextLine();
		}
		System.out.println(resultat);
		sc.close();
	}
}
