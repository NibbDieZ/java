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

public class Ejercicio05 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese sueldo base");
        int sueldo_base = intro.nextInt();
        System.out.println ("Ingrese horas extras");
        int horas_extras = intro.nextInt();
        int valor_horas_extras = (int)((((((sueldo_base)/30)*28)/180)*1.5) *horas_extras);
        int sueldo_mes = sueldo_base + valor_horas_extras;
        int desc = (sueldo_mes * 20)/100;
        int total_ganado = sueldo_mes - desc;
        System.out.println ("El sueldo base es "+sueldo_base);
        System.out.println ("El descuento es "+desc);
        System.out.println ("El total ganado es "+total_ganado);
    }
}
