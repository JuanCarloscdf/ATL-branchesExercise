package Clase5;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el precio en Dolares");
        double price,discount, adjustedPrice;

        price = scanner.nextDouble();
        System.out.println("introduzca el descuento en %");
        discount = scanner.nextDouble();
        adjustedPrice = price*(100-discount)/(100);
        System.out.println("debe pagar: "+adjustedPrice);
    }
}
