/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
//
/**
 *
 *
 */
public class jed  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Przestudiuj następujący artykuł. Następnie napisz programy demonstrujące działanie operatorów:\n"
                + "- w lewo ze znakiem <<\n"
                + "- w prawo ze znakiem >>\n"
                + "- w prawo bez znaku >>>");
        Scanner scanner = new Scanner(System.in);
        int x, y, a, b, c, d, wynik, wynik2, wynik3;
        System.out.println("\nPodaj x:");
        x = scanner.nextInt();
        System.out.println("Ile bitów w lewo:");
        y = scanner.nextInt();
        wynik = x << y;
        System.out.println("Wynik = " + wynik);

        System.out.println("\nPodaj a:");
        a = scanner.nextInt();
        System.out.println("Ile bitów w prawo :");
        b = scanner.nextInt();
        wynik2 = a >> b;
        System.out.println("Wynik = " + wynik2);

        System.out.println("\nPodaj c:");
        c = scanner.nextInt();
        System.out.println("Ile bitów w prawo wliczając bit znaku :");
        d = scanner.nextInt();
        wynik3 = c >>> d;
        System.out.println("Wynik = " + wynik3);

    }

}
