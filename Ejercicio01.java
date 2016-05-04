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

public class Ejercicio01 {
    public static void main (String[] args){
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese radio del cilindro");
        double radio = intro.nextDouble();
        System.out.println ("Ingrese altura del cilindro");
        double altura = intro.nextDouble();
        double pi = 3.14;
        double area_base = pi * (radio*radio);
        double area_lateral = (2*pi) * radio * altura;
        double area_total = (2*area_base) + area_lateral;
        double volumen = area_base * altura;
        System.out.println ("El area total del cilindro es "+area_total);
        System.out.println ("El volumen del cilindro es "+volumen);
    }
    
}
