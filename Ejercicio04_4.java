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

public class Ejercicio04_4 {
    public static void main (String[] args) {
        double horas_extras;
        double horas_trabajadas;
        double sueldo_horas_extras;
        double sueldo_base = 0;
        int grado;
        double sueldo_total;
        int isapre;
        int afp;
        double descuento = 0;
        double sueldo_total2;
        double descuento2 = 0;
        double sueldo_final;
        Scanner intro = new Scanner (System.in);
        System.out.println("Ingrese horas trabajadas");
        horas_trabajadas = intro.nextDouble();
        horas_extras = (horas_trabajadas - 40);
        if ((horas_extras >= 1) && (horas_extras <= 3)) {
        sueldo_horas_extras = (horas_extras*2000);
    } else if (horas_extras >7) {
        sueldo_horas_extras = (horas_extras*3500);
    } else {
        sueldo_horas_extras = 0;
    }
        System.out.println("Sueldo Base");
        System.out.println("1. $450000");
        System.out.println("2. $550000");
        System.out.println("3. $700000");
        System.out.println("Ingrese grado");
        grado = intro.nextInt();
        switch (grado) {
            case 1:
                sueldo_base = 450000;
                break;
            case 2:
                sueldo_base = 550000;
                break;
            case 3:
                sueldo_base = 700000;
                break;
            default:
                break;
        }
        sueldo_total = sueldo_base + sueldo_horas_extras;
        System.out.println("ISAPRE");
        System.out.println("1. Colmena");
        System.out.println("2. Ban Médica");
        System.out.println("3. Vida 3");
        System.out.println("4. Fonasa");
        System.out.println("Ingrese un numero");
        isapre = intro.nextInt();
        switch (isapre) {
            case 1:
                descuento = 0.65;
                break;
            case 2:
                descuento = 0.73;
                break;
            case 3:
                descuento = 0.7;
                break;
            default:
                break;    
        }
        sueldo_total2 = (sueldo_total*descuento);
        System.out.println("AFP");
        System.out.println("1. BanSander");
        System.out.println("2. Geometrica SA");
        System.out.println("3. Cuprum");
        System.out.println("4. Provida");
        System.out.println("Ingrese numero");
        afp = intro.nextInt();
        switch (afp) {
            case 1:
                descuento2 = 1.2;
                break;
            case 2:
                descuento2 = 1.34;
                break;
            case 3:
                descuento2 = 1.23;
                break;
            case 4:
                descuento2 = 1.29;
                break;
            default:
                break;
        }
        sueldo_final = sueldo_total2 * descuento2;
        System.out.println("El sueldo es "+sueldo_final);
    }
}
