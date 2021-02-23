/** Escriba una aplicación que reciba tres valores decimales del
 * usuario y muestre la suma, promedio, producto, cociente
 * y modulo. Los resultados se deben imprimir en formato decimal
 * con dos cifras significativas.
 */

package points;

import java.util.Scanner;

public class Point3 {
    public static void main() {
        Scanner entry = new Scanner(System.in);

        System.out.println("Digite el primer decimal: ");
        float num1 = entry.nextFloat();

        System.out.println("Digite el segundo decimal: ");
        float num2 = entry.nextFloat();

        System.out.println("Digite el tercer decimal: ");
        float num3 = entry.nextFloat();

        float add = num1+num2+num3;
        System.out.printf("suma: %.2f\n", add);
        System.out.printf("promedio: %.2f\n", add/3);
        System.out.printf("producto: %.2f\n", num1*num2*num3);
        System.out.printf("cociente: %.2f\n", (num1/num2)/num3);
        System.out.printf("modulo: %.2f\n", num1%num2%num3);
    }
}
