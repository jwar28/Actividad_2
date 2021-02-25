/**
 * Se desea construir un programa en java que permita calcular el costo total
 * de un viaje que tiene una duración en días.
 * Para ello, se requiere los siguientes datos:
 * Número de días del viaje, Total de kilómetros conducidos por día,
 * costo por litro de gasolina, promedio de kilometro por litro de gasolina,
 * pago por estacionamiento por día, pago de peajes por día.
 * Imprima en consola el resultado.
 */

package points;

import java.util.Scanner;

public class Point9 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 9");
        System.out.print("Numero de dias del viaje: ");
        int travelDays = input.nextInt();

        System.out.print("Cuantos kilometros conducio al dia?: ");
        float kmTraveled = input.nextFloat();

        System.out.print("Cuantos cuesta el litro de gasolina?: ");
        float gasPrice = input.nextFloat();

        System.out.print("Ingrese el promedio de kilometro por litro de gasolina: ");
        float kmPerLiter = input.nextFloat();

        System.out.print("Cuanto pago por estacionamiento diario?: ");
        float parkingPrice = input.nextFloat();

        System.out.print("Cuanto pago por peajes?: ");
        float tollPrice = input.nextFloat();

        float totalGas = (kmTraveled/kmPerLiter) * gasPrice;
        float pathCharge = parkingPrice + tollPrice;
        float totalTrip = (totalGas + pathCharge) * travelDays;

        System.out.printf("El total gastado en el viaje es de: %f\n", totalTrip);
    }
}
