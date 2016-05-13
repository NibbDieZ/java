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

public class Ejercicio12_3 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese monto");
        int monto = intro.nextInt();
        double kine = monto * 0.2;
        double gine = monto * 0.25;
        double trauma = monto * 0.3;
        double pediat = monto * 0.25;
        System.out.println ("Kinesiologia recibira un monto de "+kine);
        System.out.println ("Ginecologia recibira un monto de "+gine);
        System.out.println ("Traumatologia recibira un monto de "+trauma);
        System.out.println ("Pediatria recibira un monto de "+pediat);
    }
}
