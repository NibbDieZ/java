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

public class Ejercicio04_3 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese numero 1");
        int num1 = intro.nextInt();
        System.out.println ("Ingrese numero 2");
        int num2 = intro.nextInt();
        System.out.println ("Ingrese numero 3");
        int num3 = intro.nextInt();
        int sum = num1 + num2 + num3;
        int prom = sum/3;
        int doble_num1 = num1 * 2;
        int triple_num2 = num2 * 3;
        int cuadrado_num3 = num3 * num3;
        System.out.println ("La suma es "+sum);
        System.out.println ("El promedio es "+prom);
        System.out.println ("El doble del primer numero es "+doble_num1);
        System.out.println ("El triple del segundo numero es "+triple_num2);
        System.out.println ("El cuadrado del tercer numero es "+cuadrado_num3);
    }
}
