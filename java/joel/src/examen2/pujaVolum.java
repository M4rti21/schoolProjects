package examen2;

import java.util.Scanner;

public class pujaVolum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int volum = 1;
		int imput = sc.nextInt();
		while (imput != 4) {
			switch (imput) {
			case 1:
				if (volum < 5) volum += 1;
				break;
			case 2:
				if (volum > 1) volum -= 1;
				break;
			case 3:
				for (int i = 1; i <= 5; i++) {
					if (volum == i) 
						System.out.println(i + "X");
					else 
						System.out.println(i);
				}
				break;
			default:
				System.out.println("sembla que ets molt imbecil, no?");
			}
			imput = sc.nextInt();
		}
		sc.close();
	}
}
