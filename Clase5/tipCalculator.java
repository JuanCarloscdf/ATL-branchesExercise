package Clase5;

import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el total[$]");
        Double total = scanner.nextDouble();
        System.out.println("introduzca el porcentaje de propina[%]");
        Double tipPercentage = scanner.nextDouble();
        Double tip = total*tipPercentage/(100);
        System.out.println("dele al mesero:" + tip + "[$]");
    }
}
