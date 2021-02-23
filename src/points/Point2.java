/**
 * Escriba una aplicación que pida al usuario que escriba dos enteros,
 * que obtenga los números del usuario e imprima la suma, producto, diferencia
 * de los números.
 */

package points;

import java.util.Scanner;

public class Point2 {
    public static void main() {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = entry.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entry.nextInt();

        System.out.printf("La suma de los numeros es: %d\n", num1+num2);
        System.out.printf("El producto de los numeros es: %d\n", num1*num2);
        System.out.printf("La diferencia de los numeros es: %d\n", num1-num2);
    }
}
