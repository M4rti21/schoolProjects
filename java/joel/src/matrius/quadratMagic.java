package matrius;

import java.util.Scanner;

public class quadratMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[][] quadrat = new int[3][3];
        boolean good = true;
        int counter = 0;
        int acu = 0;
        int equals = 0;
        for (int i = 0; i < times; i++) {
            for (int fil = 0; fil < 3; fil++) {
                for (int col = 0; col < 3; col++) {
                    quadrat[fil][col] = sc.nextInt();
                }
            }
            for (int fil = 0; fil < 3; fil++) {
                for (int col = 0; col < 3; col++) {
                    for (int fil2 = 0; fil2 < 3; fil2++) {
                        for (int col2 = 0; col2 < 3; col2++) {
                            if (quadrat[fil][col] == quadrat[fil2][col2]) {
                                equals++;
                            }
                        }
                    }
                }
            }
            for (int fil = 0; fil < 3; fil++) {
                for (int col = 0; col < 3; col++) {
                    counter++;
                    if (counter != 3) {
                        acu += quadrat[fil][col];
                    } else {
                        acu += quadrat[fil][col];
                        if (acu != 15) {
                            good = false;
                        }
                        counter = 0;
                        acu = 0;
                    }
                }
            }
            if (good && equals == 9)
                System.out.println("SI");
            else
                System.out.println("NO");
            good = true;
        }
        sc.close();
    }
}