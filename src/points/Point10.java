/**
 * Escriba un programa en Java que lea el peso de un objeto
 * (en kilogramos) e imprima su equivalencia en:
 * gramos, libras, toneladas.
 */

package points;

import java.util.Scanner;

public class Point10 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 10");
        float weight = askWeight();

        unitConvert(weight);
    }

    /**
     * Pedirle al usuario el peso en kilogramos que desea convertir
     * @return: el valor del peso en kg
     */
    public static float askWeight(){
        System.out.print("Ingrese el peso a convertir (Kg): ");
        float weight = input.nextFloat();

        return  weight;
    }

    /**
     * Funcion que convierte el valor del peso de kilogramos a gramos,
     * libras y toneladas.
     * @param weight: este es el valor del peso que sera convertido
     */
    public static void unitConvert(float weight){
        double grams = weight * 1000;
        double pounds = weight * 2.205;
        double tons = weight / 1000;

        System.out.printf("Kilogramos -> gramos => %.4f\n", grams);
        System.out.printf("Kilogramos -> libras => %.4f\n", pounds);
        System.out.printf("Kilogramos -> toneladas => %.4f\n", tons);
    }
}
