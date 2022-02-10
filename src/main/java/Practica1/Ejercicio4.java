/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double CAMBIO = 643;
        System.out.println("Digite la cantidad de colones");
        double num = entrada.nextInt();
        double resultado = num/CAMBIO;
        System.out.printf("Total %.2f\n", resultado);
        
    }
}
