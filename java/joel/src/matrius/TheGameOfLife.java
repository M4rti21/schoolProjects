package matrius;

import java.util.Scanner;

public class TheGameOfLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int side = 0;
        int[][] taula = new int[x][y];
        fillMatrix(taula, sc);
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[0].length; j++) {
                if (i != 0 && j != 0 && i != taula.length && j != taula[0].length) {
                    if (taula[i - 1][j] == 1) {
                        side++;
                    }
                    if (taula[i][j - 1] == 1) {
                        side++;
                    }
                    if (taula[i + 1][j] == 1) {
                        side++;
                    }
                    if (taula[i][j + 1] == 1) {
                        side++;
                    }
                    if (side != 2 && side != 3) {
                        taula[i][j] = 0;
                    }
                    side = 0;
                } else if (i == 0) {
                    if (j == 0) {
                        if (taula[i + 1][j] == 1) {
                            side++;
                        }
                        if (taula[i][j + 1] == 1) {
                            side++;
                        }
                        if (side != 2 && side != 3) {
                        }
                        if (side == 2 || side == 3) {
                            taula[i][j] = 0;
                        }
                    } else if (j == taula[0].length) {
                        if (taula[i + 1][j] == 1) {
                            side++;
                        }
                        if (taula[i][j - 1] == 1) {
                            side++;
                        }
                        if (side != 2 && side != 3) {
                        }
                        if (side == 2 || side == 3) {
                            taula[i][j] = 0;
                        }
                    }else {
                        if (taula[i + 1][j] == 1) {
                            side++;
                        }
                        if (taula[i - 1][j] == 1) {
                            side++;
                        }
                        if (taula[i][j - 1] == 1) {
                            side++;
                        }
                        if (side != 2 && side != 3) {
                        }
                        if (side == 2 || side == 3) {
                            taula[i][j] = 0;
                        }
                    }
                } else if (i == taula.length) {
                    if (j == 0) {
                        if (taula[i - 1][j] == 1) {
                            side++;
                        }
                        if (taula[i][j + 1] == 1) {
                            side++;
                        }
                        if (side != 2 && side != 3) {
                        }
                        if (side == 2 || side == 3) {
                            taula[i][j] = 0;
                        }
                    } else if (j == taula[0].length) {
                        if (taula[i - 1][j] == 1) {
                            side++;
                        }
                        if (taula[i][j - 1] == 1) {
                            side++;
                        }
                        if (side != 2 && side != 3) {
                        }
                        if (side == 2 || side == 3) {
                            taula[i][j] = 0;
                        }
                    }
                }

            }
        }
        printMatrix(taula);
        sc.close();
    }

    public static void fillMatrix(int[][] mtx, Scanner sc) {
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                mtx[i][j] = sc.nextInt();
            }
        }
    }
    public static void printMatrix(int[][] mtx) {
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}