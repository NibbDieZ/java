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

public class Ejercicio03_4 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese nota (entre 1,0 y 7,0)");
        double nota = intro.nextDouble();
        if ((nota >= 1.0) && (nota <= 3.9)) {
        System.out.println ("Insuficiente");
        } else if ((nota >= 4.0) && (nota <= 4.9)) {
        System.out.println ("Suficiente");
        } else if ((nota >= 5.0) && (nota <= 5.9)) {
        System.out.println ("Bien");
        } else if ((nota >= 6.0) && (nota <= 7.0)) {
        System.out.println ("Muy bien");
        }
    }
}
