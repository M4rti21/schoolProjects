package snake;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		String[][] matriu = new String[7][7];
		Posicio pos = new Posicio();
		boolean mort = false;
		init(matriu, pos);
		posarPoma(matriu);
		while (!mort) {
			char dir = demanarDireccio();
			int status = comprovarDireccio(dir, matriu, pos);
			if (status == 0) {
				mort = true;
			} else if (status == 1) {
				moure(dir, matriu, pos);
			} else if (status == 2) {
				moure(dir, matriu, pos);
				posarPoma(matriu);
			}
			imprimirTaulell(matriu);
		}
	}

	public static void init(String[][] mat, Posicio pos) {
		pos.x = 3;
		pos.y = 3;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = " ";
			}
		}
		mat[pos.x][pos.y] = "X";
	}

	public static void posarPoma(String[][] mat) {
		Random r = new Random();
		int rx = r.nextInt(0, 7);
		int ry = r.nextInt(0, 7);
		while (mat[rx][ry].equals("X")) {
			rx = r.nextInt();
			ry = r.nextInt();
		}
		mat[rx][ry] = "O";
	}

	public static char demanarDireccio() {
		Scanner sc = new Scanner(System.in);
		char move = sc.nextLine().charAt(0);
		sc.close();
		return move;
	}

	public static void moure(char dir, String[][] mat, Posicio pos) {
		mat[pos.x][pos.y] = " ";
		switch (dir) {
		case 'w':
			mat[pos.y - 1][pos.x] = "X";
			pos.y -= 1;
			break;
		case 'a':
			mat[pos.y][pos.x - 1] = "X";
			pos.x -= 1;
			break;
		case 's':
			mat[pos.y + 1][pos.x] = "X";
			pos.y += 1;
			break;
		case 'd':
			mat[pos.y][pos.x + 1] = "X";
			pos.x += 1;
			break;
		default:
			break;
		}
	}

	public static int comprovarDireccio(char dir, String[][] mat, Posicio pos) {
		int toReturn = 0;
		switch (dir) {
		case 'w':
			switch (mat[pos.y - 1][pos.x]) {
			case "X":
				toReturn = 0;
				break;
			case " ":
				toReturn = 1;
				break;
			case "O":
				toReturn = 2;
				break;
			default:
				toReturn = 0;
				break;
			}
			break;
		case 'a':
			switch (mat[pos.y][pos.x - 1]) {
			case "X":
				toReturn = 0;
				break;
			case " ":
				toReturn = 1;
				break;
			case "O":
				toReturn = 2;
				break;
			default:
				toReturn = 0;
				break;
			}
			break;
		case 's':
			switch (mat[pos.y + 1][pos.x]) {
			case "X":
				toReturn = 0;
				break;
			case " ":
				toReturn = 1;
				break;
			case "O":
				toReturn = 2;
				break;
			default:
				toReturn = 0;
				break;
			}
			break;
		case 'd':
			switch (mat[pos.y][pos.x + 1]) {
			case "X":
				toReturn = 0;
				break;
			case " ":
				toReturn = 1;
				break;
			case "O":
				toReturn = 2;
				break;
			default:
				toReturn = 0;
				break;
			}
			break;
		default:
			break;
		}
		return toReturn;
	}

	public static void imprimirTaulell(String[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}