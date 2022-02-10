/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        String correo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su correo");
        correo = entrada.nextLine();
        String validacion = "ina.cr";
        String subcorreo;
        int arroba;
        int arroba2;
        int punto;
        int punto2;
        arroba = correo.indexOf(64);
        punto = correo.indexOf(46);
        if (arroba <= 0) {
            System.out.println("No existen arrobas en el dato introducido");
        } else {
            subcorreo = correo.substring(arroba + 1);
            arroba2 = subcorreo.indexOf(64);
            if (arroba2 != -1) {
                System.out.println("Correo invalido ahi mas de un arroba");
            } else {
                System.out.println("La posicion del arroba es la letra numero " + ++arroba);
                if (punto >= 0) {
                    subcorreo = correo.substring(punto + 1);
                    punto2 = subcorreo.indexOf(46);
                    if (punto2 != -1) {
                        System.out.println("Correo invalido ahi mas de un punto");
                    } else {
                        String dominio = correo.substring(arroba, punto);
                        System.out.println("Dominio " + dominio);
                        subcorreo = correo.substring(arroba);
                        if (subcorreo.equals(validacion)) {
                            System.out.println("Bienvenido estudiante ina");
                        } else {
                            System.out.println("Correo invalido no es del ina");
                        }
                    }

                }
            }
        }
    }
}
