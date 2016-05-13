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

public class Ejercicio13_3 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese costo del vehiculo");
        int costo_vehiculo = intro.nextInt();
        double ganancia_vendedor = costo_vehiculo * 0.08;
        double impuesto_local = costo_vehiculo * 0.03;
        double impuesto_estatal = costo_vehiculo * 0.03;
        double costo_adicional = ganancia_vendedor+impuesto_local+impuesto_estatal;
        double costo_total = costo_vehiculo+costo_adicional;
        System.out.println ("El costo del vehiculo es "+costo_vehiculo);
        System.out.println ("El costo adicional es "+costo_adicional);
        System.out.println ("El costo total es "+costo_total);
    }
}
