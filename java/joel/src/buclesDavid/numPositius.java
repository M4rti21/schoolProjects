package buclesDavid;

import java.util.Scanner;

public class numPositius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		int pos = 0;
		
		while (n != -0) {
			num = sc.nextInt();
			n -= 1;
			if (num > 0) {
				pos += 1;
			}
		}
		
		System.out.println(pos);
		sc.close();
	}
}
