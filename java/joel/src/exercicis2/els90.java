package exercicis2;
import java.util.Scanner;

import java.util.Scanner;

public class els90 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String num=String.valueOf(year);
		int index = (num.length()-2);
		char decada = num.charAt(index);
		int nou = decada - '0';
		switch (nou) {
		case 9:
			System.out.println("SI");
			break;
		default:
			System.out.println("NO");
			break;
		}
	}
}
