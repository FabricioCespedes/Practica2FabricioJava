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
public class Ejercicio2 {

    public static void main(String[] args) {
        String[][] matriz = new String[4][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite el nombre");
            matriz[i][0] = scanner.nextLine().toLowerCase();
            System.out.println("Digite el primer apellido");
            matriz[i][1] = scanner.nextLine().toLowerCase();
            System.out.println("Digite el segundo apellido");
            matriz[i][2] = scanner.nextLine().toLowerCase();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][0] + " " + matriz[i][1] + " " + matriz[i][2]);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if ((matriz[i][1] + matriz[i][2] + matriz[i][0]).compareTo((matriz[j][1]+matriz[j][2]+matriz[j][0] )) > 0) {
                    matriz[3][0] = matriz[i][0];
                    matriz[3][1] = matriz[i][1];
                    matriz[3][2] = matriz[i][2];
                    matriz[i][0] = matriz[j][0];
                    matriz[i][1] = matriz[j][1];
                    matriz[i][2] = matriz[j][2];
                    matriz[j][0] = matriz[3][0];
                    matriz[j][1] = matriz[3][1];
                    matriz[j][2] = matriz[3][2];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][0] + " " + matriz[i][1] + " " + matriz[i][2]);
        }
    }
}
