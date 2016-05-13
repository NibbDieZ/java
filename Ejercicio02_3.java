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

public class Ejercicio02_3 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese primer número");
        double num1 = intro.nextDouble();
        System.out.println ("Ingrese segundo número");
        double num2 = intro.nextDouble();
        double suma = num1 + num2;
        double mul = num1 * num2;
        System.out.println ("La suma de los números es: "+suma);
        System.out.println ("La multiplicación de los números es "+mul);
    }
}
