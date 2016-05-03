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

public class Ejercicio10 {
    public static void main (String[] args) {
        Scanner intro = new Scanner (System.in);
        System.out.println ("Ingrese cantidad de alumnos aprobados");
        double alum_aprob = intro.nextDouble();
        System.out.println ("Ingrese cantidad de alumnos reprobados");
        double alum_reprob = intro.nextDouble();
        System.out.println ("Ingrese cantidad de alumnos notables");
        double alum_not = intro.nextDouble();
        System.out.println ("Ingrese cantidad de alumnos sobresalientes");
        double alum_sobre = intro.nextDouble();
        double total_alumnos = alum_aprob+alum_reprob+alum_not+alum_sobre;
        float porc_aprob = (float)(alum_aprob/total_alumnos)*100;
        float porc_reprob = (float)(alum_reprob/total_alumnos)*100;
        float porc_not = (float)(alum_not/total_alumnos)*100;
        float porc_sobre = (float)(alum_sobre/total_alumnos)*100;
        System.out.println ("Alumnos aprobados "+porc_aprob+"%");
        System.out.println ("Alumnos reprobados "+porc_reprob+"%");
        System.out.println ("Alumnos notables "+porc_not+"%");
        System.out.println ("Alumnos sobresalientes "+porc_sobre+"%");
    }
}
