package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Contrasenyes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        ArrayList<String> usrname = new ArrayList<String>();
        ArrayList<String> passwd = new ArrayList<String>();
        String usr;
        String pwd;
        for (int i = 0; i < size; i++) {
            usrname.add(sc.next());
        }
        for (int i = 0; i < size; i++) {
            passwd.add(sc.next());
        }
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            usr = sc.next();
            pwd = sc.next();
            if (usrname.contains(usr) == false) {
                System.out.println("usuari no trobat");
            } else if (pwd.equals(passwd.get(usrname.indexOf(usr))) == false) {
                System.out.println("contrassenya incorrecta");
            } else System.out.println("OK");
        }
        usrname.sort(null);
        for (int i = 0; i < usrname.size(); i++) {
            System.out.print(usrname.get(i) + " ");
        }
        sc.close();
    }
}