/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nibb10
 */
import java.io.*;

public class Ejercicio11_3 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
        double notas_parciales;
        double promedio_talleres;
        double promedio_tareas;
        double nota_exposicion;
        double porc_notas_parciales;
        double porc_promedio_talleres;
        double porc_promedio_tareas;
        double porc_nota_exposicion;
        double promedio_notas;
        System.out.println ("Ingrese notas parciales");
        notas_parciales = Double.parseDouble (bufEntrada.readLine());
        System.out.println ("Ingrese promedio talleres");
        promedio_talleres = Double.parseDouble (bufEntrada.readLine());
        System.out.println ("Ingrese promedio de tareas");
        promedio_tareas = Double.parseDouble (bufEntrada.readLine());
        System.out.println ("Ingrese nota de exposicion");
        nota_exposicion = Double.parseDouble (bufEntrada.readLine());
        porc_notas_parciales = (notas_parciales*50)/100;
        porc_promedio_talleres = (promedio_talleres*25)/100;
        porc_promedio_tareas = (promedio_tareas*15)/100;
        porc_nota_exposicion = (nota_exposicion*10)/100;
        promedio_notas = porc_notas_parciales+porc_promedio_talleres+porc_promedio_tareas+porc_nota_exposicion;
        System.out.println ("El promedio de notas es "+promedio_notas);
    }
}
