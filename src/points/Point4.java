/**
 * Escriba un programa en Java que le solicite al usuario el valor del radio de una
 * circunferencia y calcule su longitud y área. Imprima los resultados (con dos números decimales)
*/

package points;

import java.util.Scanner;
import java.lang.Math;

public class Point4 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 4");

        float radius = askRadius();

        System.out.printf("Longitud: %.2f\n", 2 * Math.PI * radius);
        System.out.printf("Area: %.2f", Math.PI * Math.pow(radius, 2));
        System.out.println("");
    }

    /**
     * Pedirle al usuario el valor del radio de la circunferencia
     * @return: retorna el valor del radio
     */
    public static float askRadius(){
        System.out.print("Cual es el valor del radio: ");
        float radius = input.nextFloat();

        return radius;
    }
}
