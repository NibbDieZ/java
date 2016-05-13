/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nibb10
 */
import java.util.Scanner;

public class Ejercicio09_5 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int num1, num2, num3, num4, num5, num6;
        int sor1, sor2, sor3, sor4, sor5, sor6;
        int aciertos = 0;
        System.out.println("Juego del loto");
        System.out.println("Ingrese 6 números distintos (desde el 1 al 41)");
        num1 = intro.nextInt();
        num2 = intro.nextInt();
        num3 = intro.nextInt();
        num4 = intro.nextInt();        
        num5 = intro.nextInt();
        num6 = intro.nextInt();
        sor1 = (int)(Math.random()*41+1);
        if  (sor1 == num1 || sor1 == num2 || sor1 == num3 || sor1 == num4 || sor1 == num5 || sor1 == num6) {
            aciertos = aciertos + 1;
        }
        do {
            sor2 = (int)(Math.random()*41+1);
        } while  (sor2 == sor1);
        if  (sor2 == num1 || sor2 == num2 || sor2 == num3 || sor2 == num4 || sor2 == num5 || sor2 == num6) {
            aciertos = aciertos + 1;
        }
        do {
            sor3 = (int)(Math.random()*41+1);
        } while  (sor3 == sor1 || sor3 == sor2);
        if  (sor3 == num1 || sor3 == num2 || sor3 == num3 || sor3 == num4 || sor3 == num5 || sor3 == num6) {
            aciertos = aciertos + 1;
        }
        do {
            sor4 = (int)(Math.random()*41+1);
        } while  (sor4 == sor1 || sor4 == sor2 || sor4 == sor3);
        if  (sor4 == num1 || sor4 == num2 || sor4 == num3 || sor4 == num4 || sor4 == num5 || sor4 == num6) {
            aciertos = aciertos + 1;
        }
        do {
            sor5 = (int)(Math.random()*41+1);
        } while  (sor5 == sor1 || sor5 == sor2 || sor5 == sor3 || sor5 == sor4);
        if  (sor5 == num1 || sor5 == num2 || sor5 == num3 || sor5 == num4 || sor5 == num5 || sor5 == num6) {
            aciertos = aciertos + 1;
        }
        do {
            sor6 = (int)(Math.random()*41+1);
        } while  (sor6 == sor1 || sor6 == sor2 || sor6 == sor3 || sor6 == sor4 || sor6 == sor5);
        if  (sor6 == num1 || sor6 == num2 || sor6 == num3 || sor6 == num4 || sor6 == num5 || sor6 == num6) {
            aciertos = aciertos + 1;
        }
        System.out.println("Aciertos "+aciertos);
        if (aciertos < 5) {
            System.out.println("No ha obtenido premio");
        }else if (aciertos == 5) {
            System.out.println("Ha obtenido premio");
            }else if (aciertos == 6) {
        System.out.println("Ha obtenido el premio mayor!!!");
        }
    }
}
