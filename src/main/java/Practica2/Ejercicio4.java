/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Sergio
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        ArrayList<String>[][] lista = new ArrayList[1][4];
        lista[0][0] = new ArrayList<String>();
        lista[0][0].add("coleman");
        lista[0][0].add("alemonc");
        lista[0][1] = new ArrayList<String>();
        lista[0][1].add("coleman");
        lista[0][1].add("lemanco");
        lista[0][2] = new ArrayList<String>();
        lista[0][2].add("morena");
        lista[0][2].add("amoren");
        lista[0][3] = new ArrayList<String>();
        lista[0][3].add("raton");
        lista[0][3].add("trona");
        String nuevo="";
        for (int i = 0; i < 4; i++) {
            for (char letra: lista[0][i].get(1).toCharArray()) {
                nuevo = lista[0][i].get(1).substring(1);
                lista[0][i].remove(lista[0][i].get(1));
                lista[0][i].add(nuevo + letra);                
                if (lista[0][i].get(0).equals(lista[0][i].get(1))) {
                    System.out.println("Los elementos de la fila " + (i+1) + " contienen el mismo collar");
                    break;
                }
            }

        }
    }
}
