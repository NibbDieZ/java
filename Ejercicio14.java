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

public class Ejercicio14 {
    public static void main (String[] args) {
        double monto1, monto2, monto3, total;
        float porc_monto1, porc_monto2, porc_monto3;
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese monto amigo Nº1");
        monto1 = intro.nextDouble();
        System.out.println ("Ingrese monto amigo Nº2");
        monto2 = intro.nextDouble();
        System.out.println ("Ingrese monto amigo Nº3");
        monto3 = intro.nextDouble();
        total = monto1+monto2+monto3;
        porc_monto1 = (float) ((monto1/total)*100);
        porc_monto2 = (float) ((monto2/total)*100);
        porc_monto3 = (float) ((monto3/total)*100);
        System.out.println ("Monto amigo Nº1: "+porc_monto1+"%");
        System.out.println ("Monto amigo Nº2: "+porc_monto2+"%");
        System.out.println ("Monto amigo Nº3: "+porc_monto3+"%");
    }
    
}
