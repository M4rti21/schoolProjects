package buclesDavid;

import java.util.Scanner;

public class cuadrat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int height;
		int width;
		int squares = 0;
		int bigger;
		int smaller;

		for (int i = 0; i < times; i++) {
			height = sc.nextInt();
			width = sc.nextInt();
			if (height > width) {
			    bigger = height;
			    smaller = width;
			} else {
			    bigger = width;
			    smaller = height;
			}
			for (int b = 1; b <= bigger; b++) {
			    for (int s = 1; s <= smaller; s++) {
			        if (s * s <= bigger) {
			            squares++;
			        }
			    }
			}
			System.out.println(squares);
			squares = 0;
		}
		sc.close();
	}
}
