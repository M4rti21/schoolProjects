package arraysSimples;

import java.util.Scanner;

public class Shipeo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int imp;
        int sol;
        int con = 0;
        for (int i = 0; i < n; i++) {
            imp = sc.nextInt();
            sol = sc.nextInt();
            while (sol != 0) {
                imp -= sol;
                sol = sc.nextInt();
                if (imp > -1) con++;
            }
            System.out.println(con);
            con = 0;
        }
        sc.close();
    } 
}
