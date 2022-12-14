package buclesDavid;

import java.util.Scanner;

public class pere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String an = sc.nextLine();
        int a = sc.nextInt();
        sc.nextLine();
        String bn = sc.nextLine();
        int b = sc.nextInt();
        if (a > b)
            System.out.println(an);
        else if (b > a)
            System.out.println(bn);
        else
            System.out.println("Cap és més vell");
        sc.close();
    }
} 