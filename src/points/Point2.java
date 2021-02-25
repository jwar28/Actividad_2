/**
 * Escriba una aplicación que pida al usuario que escriba dos enteros,
 * que obtenga los números del usuario e imprima la suma, producto, diferencia
 * de los números.
 */

package points;

import java.util.Scanner;

public class Point2 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 2");
        int[] numberList = askNums();
        int num1 = numberList[0];
        int num2 = numberList[1];

        System.out.printf("La suma de los numeros es: %d\n", num1+num2);
        System.out.printf("El producto de los numeros es: %d\n", num1*num2);
        System.out.printf("La diferencia de los numeros es: %d\n", num1-num2);
        System.out.println("");
    }

    /**
     * Pedirle al usuario dos numeros enteros y almacenarlos en una lista
     * (num1, num2)
     * @return: retorna la lista con estos dos valores
     */
    public static int[] askNums(){
        System.out.println("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = input.nextInt();

        int [] numbers = {num1, num2};
        return numbers;
    }
}
