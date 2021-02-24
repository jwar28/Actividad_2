/**
 * Escriba un programa en Java que lea un carácter e imprima su correspondiente
 * valor numérico
 * (utilizar la conversión de tipos).
 */

package points;

import java.util.Scanner;

public class Point5 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 5");

        char c = askChar();

        System.out.printf("El valor ascii de el caracter %c es: %d", c, (int)c);
        System.out.print("");
    }

    /**
     * Pedirle al usuario que ingrese un caracter
     * @return: retorna el caracter
     */
    public static char askChar(){
        System.out.print("Ingrese un caracter: ");

        char c = input.next().charAt(0);

        return c;
    }
}
