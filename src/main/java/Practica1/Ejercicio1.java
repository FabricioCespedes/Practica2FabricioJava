/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Ejercicio1 {
    
    public enum Meses{
        DICIEMBRE,
        NOVIEMBRE,
        OCTUBRE,
        SEPTIEMBRE,
        AGOSTO,
        JULIO,
        JUNIO,
        MAYO,
        ABRIL,
        MARZO,
        FEBRERO,
        ENERO
    }
    
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un mes");
        String salida= "No existe ese mes";
        String mesEntrada = entrada.nextLine();    
        Meses[] meses = Meses.values();
        Arrays.sort(meses, Collections.reverseOrder()); 
        for (int i = 0; i < 12; i++) {
            if (mesEntrada.equalsIgnoreCase(meses[i].toString())) {
                        salida = String.valueOf("El numero de mes es " + ++i);
            }
        }
       System.out.println(salida);

    }
    
    
}
