/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

import java.util.Scanner;

/**
 *
 * @author Progra
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int sumaRequerida;
        boolean bandera = false;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite un numero entre 1 y 15");
                matriz[i][j] = scanner.nextInt();
                System.out.flush();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println("Suma requerida");
        sumaRequerida = scanner.nextInt();
        int contador = 0;
        int k  = 0;
        int l;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    k = i+1;
                    l = 0;
                }else{
                     k = i;
                     l = j+1;
                }
                for (; k < 3; k++) {
                    for (; l < 3; l++) {
                        if (matriz[i][j] + matriz[k][l] == sumaRequerida) {
                            System.out.println("Valor encontrado, combinacion:  " + matriz[i][j] + " + " + matriz[k][l]);
                            contador++;
                        }
                    }
                }

            }
        }

    }
}
