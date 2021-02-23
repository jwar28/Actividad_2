/** 
 * Escriba un programa en java que lea dos datos de tipo entero, los almacene en 
 * dos variables num1 y num2, y ejecute las siguientes instrucciones, analice 
 * los resultados.
 */

package points;

import java.util.Scanner;

public class Point1 {
    public static void main() {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = entry.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entry.nextInt();

        System.out.printf("x = %d\n", num1);
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, (num1 + num1));
        System.out.printf("x = %.2f\n", (float) num1);
        System.out.printf("%d - %d\n", (num1 + num2), (num2 + num1));
    }
}
