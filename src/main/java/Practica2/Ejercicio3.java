/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        String nombre;
        String apellido;
        String apellido2;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite el nombre");
            nombre = scanner.nextLine().toLowerCase();
            System.out.println("Digite el primer apellido");
            apellido = scanner.nextLine().toLowerCase();
            System.out.println("Digite el segundo apellido");
            apellido2 = scanner.nextLine().toLowerCase();
            lista.add(apellido + " " + apellido2 + " " + nombre);
        }
        for (String nombrecompleto : lista) {
            System.out.println(nombrecompleto);
        }
        System.out.println("Ordenado");
        Collections.sort(lista);
        for (String nombrecompleto : lista) {
            System.out.println(nombrecompleto);
        }
    }
}
