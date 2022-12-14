package buclesDavid;

import java.util.Scanner;

public class aparcament {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float car = sc.nextFloat();
		boolean sw = true;
		float num1;
		float num2;
		int count = 1;
		float space;
		float smallestSpace = Float.MAX_VALUE;
		int place = 0;
		
		while (sw == true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			space = num2 - num1;
			if (num1 == 0 && num2 != 0) {
				if (place == 0) {
					System.out.println("NO");
				} else {
					System.out.println("SI " + place);
				}
				car = num2;
				count = 0;
				smallestSpace = Float.MAX_VALUE;
				place = 0;
			} else if (num1 == 0 && num2 == 0){
				sw = false;
			} else if (space >= (car + (car/2))) {
				if (space < smallestSpace) {
					smallestSpace = space;
					place = count;
				}
			}
			count += 1;
		}
		if (place == 0) {
			System.out.println("NO");
		} else {
			System.out.println("SI " + place);
		}
		sc.close();
	}
}
