/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
/**
 *
 *
 */
public class trz {
//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Rekurencja:");
        y(10);

    }

    public static int y(int x) {
        if (x == 0) {
            return 0;
        } else {
            System.out.println("Liczba = " + x);
            y(--x);
            return 0;
        }

    }

}
