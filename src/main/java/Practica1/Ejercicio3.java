/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

import static java.lang.System.in;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int numMin;
        int numMax;
        int num;
        Random r = new Random();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad numero");
        num = entrada.nextInt();
        if (num > 0) {
            int arreglo[] = new int[num];
            System.out.println("Digite el primer numero");
            numMin = entrada.nextInt();
            System.out.println("Digite el segundo numero");
            numMax = entrada.nextInt();
            if (numMax > numMin) {
                            for (int i = 0; i < num; i++) {
                arreglo[i] = numMin + r.nextInt((numMax - numMin) + 1);
            }
            for (int i = 0; i < num; i++) {
                System.out.println(arreglo[i]);
            }
            }else {
            System.out.println("Error a digitado los numeros de forma incorrecta");
        }

        } else {
            System.out.println("Error");
        }

    }
}
