/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jhonriv.exercisesissue4;

/**
 *
 * @author JhonRiv
 */
public class ExercisesIssue4 {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.");
        conditionalIf((int)Math.floor(Math.random() * (20 - (-20) + 1) + (-20)));
        System.out.println("--------------------------------------------------------");
        System.out.println();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Crea un bucle While, que la variable numeroWhile sea inferior a 3 e imprimalo");
        estructureWhile();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Crea un bucle While, que solo se ejecuta una vez");
        estructureWhileDo();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Crea un bucle For, que la variable numeroFor sea inferior a 3 e imprimalo");
        estructureFor();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Crea un Switch, que seleccione una estacion y lo retorne, incluye un default");
        estructureSwitch((int)Math.floor(Math.random() * (4 - 0 + 1) + 0));
        System.out.println("--------------------------------------------------------");
        System.out.println();
    }
    
    static void conditionalIf(int numeroIf) {
        if (numeroIf > 0) System.out.println("Number " + numeroIf + " is positive");
        else if (numeroIf < 0) System.out.println("Number " + numeroIf + " is negative");
        else System.out.println("Number " + numeroIf + " is zero");
    }
    
    static void estructureWhile() {
        int i = 0;
        while (i < 3) {
            System.out.println("Number is " + i);
            i++;
        }
    }
    
    static void estructureWhileDo() {
        int i = 0;
        do {
            System.out.println("Number is " + i);
        } while (i != 0);
    }
    
    static void estructureFor() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Number is " + numeroFor);
        }
    }
    
    static void estructureSwitch(int option) {
        switch(option) {
            case 1 -> System.out.println("Is Summer");
            case 2 -> System.out.println("Is Fall");
            case 3 -> System.out.println("Is Spring");
            case 4 -> System.out.println("Is Winter");
            default -> System.out.println("Error Option");
        }
    }
}
