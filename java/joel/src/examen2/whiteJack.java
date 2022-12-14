package examen2;

import java.util.Scanner;

public class whiteJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int[] num = new int[9];
		int sum = 0;
		int count = 0;
		for (int i = 0; i < times; i++) {
			for (int ii = 0; ii < 9; ii++) {
				num[ii] = sc.nextInt();
			}
			while (sum < num[9]) {
				sum += num[count];
				count ++;
			}
			System.out.println(count);
		}
		sc.close();
	}
}