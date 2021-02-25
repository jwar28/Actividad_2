/**
 *Desarrolle un programa en java que calcule el índice de masa corporal BMI el cual está
 * dado por la formula (pesoenKg/alturaenmetros*alturaenmetros)
 */

package points;

import java.util.Scanner;

public class Point6 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 6");
        float height = askHeight();
        float weight = askWeight();

        System.out.printf("Su BMI es: %.1f", weight/Math.pow(height, 2));
        System.out.println("");
    }

    /**
     * Pedirle al usuario su peso en Kg
     * @return: retorna el peso del usuario
     */
    public static float askWeight(){
        System.out.print("Su peso es?: ");
        float weight = input.nextFloat();

        return weight;
    }

    /**
     * Pedirle al usuario su altura
     * @return: retorna la altura del user
     */
    public static float askHeight(){
        System.out.print("Su altura es?: ");
        float height = input.nextFloat();

        return height;
    }
}
