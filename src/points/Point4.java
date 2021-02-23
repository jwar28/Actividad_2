/*Escriba un programa en Java que le solicite al usuario el valor del radio de una
circunferencia y calcule su longitud y área. Imprima los resultados (con dos números decimales)
*/

package points;

import java.util.Scanner;
import java.lang.Math;

public class Point4 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float radius, length, area, pi;

        System.out.println("Cual es el valor del radio: ");
        radius = entry.nextFloat();

        System.out.printf("Longitud: %.4f", 2 * Math.PI * radius);
        System.out.printf("Longitud: %.4f", Math.PI * Math.pow(radius, 2));
    }
}
