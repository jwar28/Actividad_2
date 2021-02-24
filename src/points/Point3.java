/** Escriba una aplicación que reciba tres valores decimales del
 * usuario y muestre la suma, promedio, producto, cociente
 * y modulo. Los resultados se deben imprimir en formato decimal
 * con dos cifras significativas.
 */

package points;

import java.util.Scanner;

public class Point3 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 3");

        float [] numberList = askNums();
        float num1 = numberList[0], num2 = numberList[1], num3 = numberList[2],
                add;

        add = num1+num2+num3;
        System.out.printf("suma: %.2f\n", add);
        System.out.printf("promedio: %.2f\n", add/3);
        System.out.printf("producto: %.2f\n", num1*num2*num3);
        System.out.printf("cociente: %.2f\n", (num1/num2)/num3);
        System.out.printf("modulo: %.2f\n", num1%num2%num3);
        System.out.println("");
    }

    /**
     * Pedirle al usuario tres numeros decimales y almacenarlos en una lista
     * (num1, num2, num3)
     * @return: retorna la lista con los valores decimales
     */
    public static float[] askNums(){
        System.out.println("Digite el primer decimal: ");
        float num1 = input.nextFloat();

        System.out.println("Digite el segundo decimal: ");
        float num2 = input.nextFloat();

        System.out.println("Digite el tercer decimal: ");
        float num3 = input.nextFloat();

        float [] numbers = {num1, num2, num3};
        return numbers;
    }
}
