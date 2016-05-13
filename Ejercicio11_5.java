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

public class Ejercicio11_5 {
    public static void main (String[] args){
        Scanner intro = new Scanner (System.in);
        int cont;
        double aprob = 0;
        double reprob = 0;
        double max = 0;
        double min = 7;
        double acum_notas = 0;
        System.out.println("Ingrese cantidad de notas");
        double cant_notas = intro.nextDouble();
        for (cont=1; cont <= cant_notas; cont++){
            System.out.println("Ingrese nota Nº"+cont);
            double nota = intro.nextDouble();
            acum_notas = acum_notas + nota;
            if (nota >= 4.0) {
                aprob = aprob + 1;
            }
            else { reprob = reprob + 1;
            }
            if (nota > max) {
                max = nota;
            }
            if (nota < min) {
                min = nota;
            }
        }
        double prom = (acum_notas/cant_notas);
        double porc = (reprob/(aprob + reprob)) *100;
        if ((prom >= 4.0) && (porc < 50)) {
            System.out.println("Aprobado");
        }else {
            System.out.println("Reprobado");
        }
    }
}
