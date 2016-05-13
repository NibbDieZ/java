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

public class Ejercicio03_3 {
    public static void main (String[] args){
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese edad");
        int edad = intro.nextInt();
        long bisiestos = edad/4;
        int dias_vividos = edad * 360;
        int dias_totales = (int)(bisiestos + dias_vividos);
        System.out.println ("Dias vividos "+dias_totales);
    }
}
