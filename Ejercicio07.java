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
public class Ejercicio07 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese edad");
        int edad = intro.nextInt();
        int num_puls = (220-edad)/10;
        System.out.println ("Pulsaciones: "+num_puls);
    }
}
