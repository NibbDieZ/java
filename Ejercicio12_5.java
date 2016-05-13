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

public class Ejercicio12_5 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Sandwich: $300");
        int sw = 0, op, val_ing = 0;
        int ing = 0;
        do {
            System.out.println("¿Que desea agregar?");
        System.out.println("1. Churrasco: + $400");
        System.out.println("2. Lomo de cerdo: + $350");
        System.out.println("3. Ave: + $250");
        System.out.println("4. Atún: + $350");
        op = sc.nextInt();
        switch (op) {
            case 1:
                sw = 700;
                break;
            case 2:
                sw = 750;
                break;
            case 3:
                sw = 550;
                break;
            case 4:
                sw = 650;
                break;
            default:
                System.out.println("Ingrese opcion valida");
        }
        } while ((op != 1) && (op != 2) && (op != 3) && (op != 4));
        
        System.out.println("¿Desea agregar mas ingredientes?");
        System.out.println("1. Si");
        System.out.println("Otro numero, Finalizar compra");
        op = sc.nextInt();
        if (op == 1) {
            System.out.println("Presione 1 para agregar, otro numero para no agregar");
            System.out.println("¿Desea agregar lechuga?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar tomate?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar champignon?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar palta?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar palmitos?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar queso?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar tocino?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar jamon?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar huevo frito?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
            System.out.println("¿Desea agregar cebolla?");
            op = sc.nextInt();
            if (op == 1) {
                ing = ing + 1;
            }
        }
        if ((ing > 0) && (ing < 4)) {
            val_ing = ing * 150;
        } else {
            if ((ing >= 4) && (ing <= 5)) {
                val_ing = ing * 120;
            } else {
                if (ing > 5) {
                    val_ing = ing * 100;
                }
            }
        }
        int prec = sw + val_ing;
        System.out.println("El precio de la compra es $"+prec);
    }
}
