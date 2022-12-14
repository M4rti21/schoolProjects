package theGameOfLIfe;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	static Scanner sc = new Scanner(System.in);
	static char[][] tau;
	static final char viu = 'X';
	static final char mort = ' ';
	
	public static void main(String[] args) {
		inicialitzarTauler();
		int resp = -1;
		while (resp != 0) {
			System.out.println("1.-	Inicialitzar nou tauler");
			System.out.println("2.-	Visualitzar tauler");
			System.out.println("3.-	Iterar");
			System.out.println("0.-	Sortir");
			resp = sc.nextInt();
			switch (resp) {
			case 1:
				inicialitzarTauler();
				break;
			case 2:
				visualitzarTauler();
				break;
			case 3:
				iterar();
				break;
			case 0:
				System.out.println("Sortint...");
				System.out.println("Adeu!");
				break;
			default:
				System.out.println("Per tonto tambe surto...");
				System.out.println("Adeu!");
				resp = 0;
				break;
			}
		}
	}

	public static void inicialitzarTauler() {
		int x, y;
		System.out.println("Digues les dimensions del tauler");
		System.out.println("X:");
		x = sc.nextInt();
		System.out.println("Y:");
		y = sc.nextInt();
		Random r = new Random();
		int[] lix = new int[x * y / 3];
		int[] liy = new int[x * y / 3];
		for (int i = 0; i < lix.length; i++) {
			lix[i] = r.nextInt(1, x);
		}
		for (int i = 0; i < liy.length; i++) {
			liy[i] = r.nextInt(1, y);
		}
		tau = new char[y + 2][x + 2];
		for (int i = 0; i < tau.length; i++) {
			for (int j = 0; j < tau[0].length; j++) {
				if (i == 0 && j == 0) {
					tau[i][j] = '┏';
				} else if (i == tau.length - 1 && j == tau[0].length - 1) {
					tau[i][j] = '┛';
				} else if (i == 0 && j == tau[0].length - 1) {
					tau[i][j] = '┓';
				} else if (i == tau.length - 1 && j == 0) {
					tau[i][j] = '┗';
				} else if (j == 0) {
					tau[i][j] = '┃';
				} else if (j == tau[0].length - 1) {
					tau[i][j] = '┃';
				} else if (i == 0) {
					tau[i][j] = '━';
				} else if (i == tau.length - 1) {
					tau[i][j] = '━';
				} else {
					tau[i][j] = mort;
				}
			}
		}
		for (int i = 0; i < lix.length; i++) {
			tau[liy[i]][lix[i]] = viu;
		}
	}

	public static void visualitzarTauler() {
		for (int i = 0; i < tau.length; i++) {
			for (int j = 0; j < tau[0].length; j++) {
				System.out.print(tau[i][j]);
			}
			System.out.println();
		}
	}

	public static void iterar() {
		System.out.println("Tauler actual:");
		visualitzarTauler();
		System.out.println("Digues un numero d'iteracions:");
		int it = sc.nextInt();
		for (int i = 0; i < it; i++) {
			evolucionar();
			visualitzarTauler();
		}
	}

	public static void evolucionar() {
		char[][] tau2 = new char[tau.length][tau[0].length];
		for (int i = 1; i < tau.length - 1; i++) {
			for (int j = 1; j < tau[0].length - 1; j++) {
				int sup = comprovarVeins(i, j);
				if (tau[i][j] == viu) {
					if (sup == 2 || sup == 3) {
						tau2[i][j] = viu;
					} else {
						tau2[i][j] = mort;
					}
				} else {
					if (sup == 3) {
						tau2[i][j] = viu;
					} else {
						tau2[i][j] = mort;
					}
				}
			}
		}
		for (int i = 1; i < tau.length -1; i++) {
			for (int j = 1; j < tau[0].length -1; j++) {
				tau[i][j] = tau2[i][j];
			}
		}
	}
	
	public static int comprovarVeins(int i, int j) {
		int sup = 0;
		if (tau[i + 1][j + 1] == viu) {
			sup++;
		}
		if (tau[i - 1][j - 1] == viu) {
			sup++;
		}
		if (tau[i + 1][j - 1] == viu) {
			sup++;
		}
		if (tau[i + 1][j - 1] == viu) {
			sup++;
		}
		if (tau[i - 1][j + 1] == viu) {
			sup++;
		}
		if (tau[i - 1][j] == viu) {
			sup++;
		}
		if (tau[i + 1][j] == viu) {
			sup++;
		}
		if (tau[i][j - 1] == viu) {
			sup++;
		}
		if (tau[i][j + 1] == viu) {
			sup++;
		}
		return sup;
	}

}