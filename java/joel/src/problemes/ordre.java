package problemes;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ordre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		double a = sc.nextDouble();
		DecimalFormat numberFormat = new DecimalFormat("00000000000.000");
		System.out.println(numberFormat.format(a*a));
		sc.close();
	}
}