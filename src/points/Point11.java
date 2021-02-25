/**
 * Desarrolle un programa en java que lea una cantidad numérica
 * entre cero y mil (0 y 1000) e imprima la cifra correspondiente a sus
 * unidades, decenas y centenas.
 */

package points;

import java.util.Scanner;

public class Point11 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 11");
        int num = askNumber();

        showUnits(num);
    }

    /**
     * Pedirle al usuario un numero entre 0 y 1000 para desglosarlo
     * @return: retorna el valor del numero
     */
    public static int askNumber(){
        int num;
        while (true){
            System.out.print("Ingrese un numero (0-1000): ");
            num = input.nextInt();

            if (num >= 1000 || num < 0){
                System.out.println("Fuero de rango, ingrese otro numero");
                continue;
            }
            break;
        }
        return num;
    }

    /**
     * Funcion que desglosa el numero digitado en unidades, decenas y centenas
     * @param num: recibe el valor del numero para ser desglosado
     */
    public static void showUnits(int num){
        System.out.printf("Unidad: %d\n", num % 10);
        System.out.printf("Decena: %d\n", (num / 10) % 10);
        System.out.printf("Centena: %d\n", (num / 100) % 10);
    }
}
