/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int dia;
        int mes;
        int anio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el dia de nacimiento en numero");
        dia = entrada.nextInt();
        System.out.println("Digite el mes de nacimiento en numero");
        mes = entrada.nextInt();
        System.out.println("Digite el anio de nacimiento en numero");
        anio = entrada.nextInt();
        Date date = new Date(anio, mes, dia);
        System.out.printf("%1$td-%1$tm-%1$ty %n", date);
        LocalDate f1 = LocalDate.of(anio, mes, dia);
        LocalDate f2 = LocalDate.now();
        Period period = Period.between(f1, f2);
        System.out.println("Tienes " + period.getYears() + " años");
    }
}
