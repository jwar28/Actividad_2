/**
 * Juan conoce el precio de compra y
 * de venta de unos de los productos de su tienda y requiere conocer cuál es su % de utilidad.
 * Desarrolle un programa en java que lo ayude con ese cálculo.
 */

package points;

import java.util.Scanner;

public class Point7 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPUNTO 7");
        float purchasePrice = askPurchasePrice(),
                salePrice = askSalePrice();

        utility(purchasePrice, salePrice);
    }

    /**
     * Pedirle al usuario que ingrese el valor por el que compra el producto
     * @return: retorna el valor por el que se adquiere el producto
     */
    public static float askPurchasePrice(){
        System.out.print("El precio de compra es: ");
        float purchasePrice = input.nextFloat();

        return purchasePrice;
    }

    /**
     * Pedirle al usuario que ingrese el valor por el que vende el producto
     * @return: retorna el valor por el que se vende el producto
     */
    public static float askSalePrice(){
        System.out.print("El precio de venta es: ");
        float salePrice = input.nextFloat();

        return salePrice;
    }

    /**
     * Funcion que calcula la utilidad de un producto recibiendo valores de compra y venta
     * @param purchasePrice: recibe el valor por el que se compra el producto
     * @param salePrice: recibe el valor por el que se vende el producto
     *                 se reciben para hacer el calculo de utilidad
     */
    public static void utility(float purchasePrice, float salePrice){
        float utility = ((salePrice - purchasePrice)/salePrice)*100;
        System.out.printf("La utilidad del producto es: %.1f%%", utility);
        System.out.println("");
    }
}
