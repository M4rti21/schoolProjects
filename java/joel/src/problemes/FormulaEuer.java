package problemes;

import java.util.Arrays;
import java.util.Scanner;

public class FormulaEuer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int len;
		int a;
		for (int i = 0; i < times; i++) {
			len = sc.nextInt();
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);  
			for (int j = 0; j < len/2; j++) {
				a = arr[j] + arr[arr.length-j-1];
				System.out.print(a + " ");
			}
			System.out.println("");
		}
		sc.close();
	}
}