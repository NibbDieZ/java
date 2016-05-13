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

public class Ejercicio01_4 {
    public static void main (String[] args) {
        int num1, num2, num3, num4, max;
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese 4 números");
        num1 = intro.nextInt();
        num2 = intro.nextInt();
        num3 = intro.nextInt();
        num4 = intro.nextInt();
        if ((num1 >= num2) && (num1 >= num3) && (num1 >= num4)) {
            max = num1;
        } else if ((num2 >= num1) && (num2 >= num3) && (num2 >= num4)) {
            max = num2;
        } else if ((num3 >= num1) && (num3 >= num2) && (num3 >= num4)) {
            max = num3;
        } else { max = num4;
                }
        System.out.println ("El mayor es "+max);
            }
}
