/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
import java.util.Scanner;

/**
 *
 *
 */
public class dwa {

    /**
     * @param args the command line arguments
     */
    static int monte(int x, int y) {

        int wynik;
        wynik = x + y; 
        return wynik;

    }

    public static void main(String[] args) {

        System.out.println("Jakimi operatorami w Javie definiuje się operacje logiczne NOT i XOR?");

        System.out.println("Co chcesz wykonać: \n"
                + "1. NOT\n"
                + "2. XOR\n");
        Scanner scanner = new Scanner(System.in);
        int funkcja = scanner.nextInt();

        switch (funkcja) {
            case 1:

                System.out.println("NOT: ");
                System.out.println("Podaj dwie liczby:  ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (monte(x, y) != 20) {
                    System.out.println("dobrze");
                } else {
                    System.out.println("źle");
                }

                break;

            // TODO code application logic here
        }

    }
}
