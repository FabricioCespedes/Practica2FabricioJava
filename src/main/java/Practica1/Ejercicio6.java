/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        String cadena;
        Scanner entrada = new Scanner(System.in);
        int suma = 0 ;
        ArrayList<Character> letras = new ArrayList<Character>();

        for (int i = 0; i < 26; i++) {
            letras.add((char) (96 + i)) ;
        }
        System.out.println("Escriba la oracion");
        cadena = entrada.nextLine().toLowerCase();
        for( char letra: cadena.toCharArray() ){
          suma += letras.indexOf( letra );
        }
        
       System.out.println( cadena + " total " + suma);

    }
}
