/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nibb10
 */


public class Ejercicio9 {
    public static void main (String[] args) {
        int tiempo_1 = (int)(Math.random()*45+1);
        int tiempo_2 = (int)(Math.random()*45+1);
        int tiempo_3 = (int)(Math.random()*45+1);
        int tiempo_4 = (int)(Math.random()*45+1);
        int tiempo_5 = (int)(Math.random()*45+1);
        int tiempo_6 = (int)(Math.random()*45+1);
        int prom = (tiempo_1+tiempo_2+tiempo_3+tiempo_4+tiempo_5+tiempo_6)/6;
        System.out.println ("El promedio en minutos que se demora el atleta en recorrer la ruta en una semana cualquiera es "+prom);
    }
}
