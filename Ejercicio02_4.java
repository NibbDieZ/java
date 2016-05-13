/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nibb10.
 */
import java.util.Scanner;

public class Ejercicio02_4 {
    public static void main (String [] args) {
        Scanner intro = new Scanner (System.in);
        int B20000 = 0;
        int B10000 = 0;
        int B5000 = 0;
        int B2000 = 0;
        int B1000 = 0;
        int M500 = 0;
        int M100 = 0;
        int M50 = 0;
        int M10 = 0;
        int M5 = 0;
        int M1 = 0;
        System.out.println ("Ingrese cantidad");
        int din = intro.nextInt();
        while (din > 0) {
            if (din >= 20000) {
                B20000 = B20000 + 1;
                din = din - 20000;
            } else if (din >= 10000) {
                B10000 = B10000 + 1;
                din = din - 10000;
            } else if (din >= 5000) {
                B5000 = B5000 + 1;
                din = din - 5000;
            } else if (din >= 2000) {
                B2000 = B2000 + 1;
                din = din - 2000;
            } else if (din >= 1000) {
                B1000 = B1000 + 1;
                din = din - 1000;
            } else if (din >= 500) {
                M500 = M500 + 1;
                din = din - 500;
            } else if (din >= 100) {
                M100 = M100 + 1;
                din = din - 100;
            } else if (din >= 50) {
                M50 = M50 + 1;
                din = din - 50;
            } else if (din >= 10) {
                M10 = M10 + 1;
                din = din - 10;
            } else if (din >= 5) {
                M5 = M5 + 1;
                din = din - 5;
            } else {
                M1 = M1 + 1;
                din = din - 1;
            }
        }
        System.out.println ("Cantidad de billetes de 20000: "+B20000);
        System.out.println ("Cantidad de billetes de 10000: "+B10000);
        System.out.println ("Cantidad de billetes de 5000: "+B5000);
        System.out.println ("Cantidad de billetes de 2000: "+B2000);
        System.out.println ("Cantidad de billetes de 1000: "+B1000);
        System.out.println ("Cantidad de monedas de 500: "+M500);
        System.out.println ("Cantidad de monedas de 100: "+M100);
        System.out.println ("Cantidad de monedas de 50: "+M50);
        System.out.println ("Cantidad de monedas de 10: "+M10);
        System.out.println ("Cantidad de monedas de 5: "+M5);
        System.out.println ("Cantidad de monedas de 1: "+M1);
    }
}
