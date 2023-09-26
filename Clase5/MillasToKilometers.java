package Clase5;

import java.util.Scanner;

public class MillasToKilometers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("¿escribe una distancia en millas[mi]?");
        double millas = input.nextDouble();
        double kilometers = millas * 1.60934;
        System.out.println( millas + " [mi] = " + kilometers + "[km]" );
    }
}
