package buclesDavid;

import java.util.Scanner;

public class ferrero2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int timesNum = sc.nextInt(); // HOW MANY TIMES?
		int triangle; // CREATE VALUE FOR EACH TIME
		int total = 0;
		int pisTotal = 0;

		for (int timesLoop = 0; timesLoop < timesNum; timesLoop++) { // START MAIN LOOP
			triangle = sc.nextInt(); // GET FIRST TRIANGLE SIZE
			for (int triangleLoop = 1; triangleLoop < triangle + 1; triangleLoop++) { // START VERTICAL LOOP
				for (int pis = 1; pis < triangleLoop + 1; pis++) {
					pisTotal += pis;
				}
				total = total + pisTotal;
				pisTotal = 0;
			}
			System.out.println(total);
			total = 0;
		}
		sc.close();
	}
}