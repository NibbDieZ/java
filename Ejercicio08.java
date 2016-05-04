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
        
public class Ejercicio08 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese sueldo");
        int sueldo = intro.nextInt();
        double aumento = (sueldo*10)/100;
        double sueldo_total = sueldo + aumento;
        System.out.println ("El sueldo aumentado en un 20% es "+sueldo_total);
    }
}
