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

public class Ejercicio06 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
        int cant_comp_ita;
        int cant_comp_chi;
        int cant_hamb;
        int cant_churr;
        int cant_cerv;
        int cant_beb;
        int valor_comp_ita;
        int valor_comp_chi;
        int valor_hamb;
        int valor_churr;
        int valor_cerv;
        int valor_beb;
        int valor_compra;
        int IVA;
        int valor_total;
        System.out.println ("Ingrese producto...");
        System.out.println ("Ingrese cantidad de completos italianos");
        cant_comp_ita = Integer.parseInt (bufEntrada.readLine());
        System.out.println ("Ingrese cantidad de completos a la chilena");
        cant_comp_chi = Integer.parseInt (bufEntrada.readLine());
        System.out.println ("Ingrese cantidad de hamburguesas");
        cant_hamb = Integer.parseInt (bufEntrada.readLine());
        System.out.println ("Ingrese cantidad de churrascos");
        cant_churr = Integer.parseInt (bufEntrada.readLine());
        System.out.println ("Ingrese cantidad de cervezas");
        cant_cerv = Integer.parseInt (bufEntrada.readLine());
        System.out.println ("EIngrese cantidad de bebidas");
        cant_beb = Integer.parseInt (bufEntrada.readLine());
        valor_comp_ita = cant_comp_ita * 690;
        valor_comp_chi = cant_comp_chi * 890;
        valor_hamb = cant_hamb * 990;
        valor_churr = cant_churr * 1100;
        valor_cerv = cant_cerv * 700;
        valor_beb = cant_beb * 500;
        valor_compra = valor_comp_ita+valor_comp_chi+valor_hamb+valor_churr+valor_cerv+valor_beb;
        IVA = (valor_compra*19)/100;
        valor_total = valor_compra - IVA;
        System.out.println ("El valor de la compra es "+valor_compra);
        System.out.println ("El IVA es "+IVA);
        System.out.println ("El valor total es "+valor_total);
    }
}
