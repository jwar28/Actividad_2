/** 
 * Escriba un programa en java que lea dos datos de tipo entero, los almacene en 
 * dos variables num1 y num2, y ejecute las siguientes instrucciones, analice 
 * los resultados.
 */

package points;

import java.util.Scanner;

public class Point1 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 1");
        int[] numberList = askNums();
        int num1 = numberList[0], num2 = numberList[1];

        System.out.printf("x = %d\n", num1);
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, (num1 + num1));
        System.out.printf("x = %.2f\n", (float) num1);
        System.out.printf("%d - %d\n", (num1 + num2), (num2 + num1));
        System.out.println("");
    }

    /**
     * Pedirle al usuario dos numeros enteros y almacenarlos en una lista
     * (num1, num2)
     * @return: retorna la lista con estos dos valores
     */
    public static int[] askNums(){
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();

        int [] numbers = {num1, num2};
        return numbers;
    }
}
