package Clase5;

import java.util.Scanner;

public class Main {
   public static void main (String[] args){
        Scanner scanned = new Scanner(System.in);
        String completeName = "";

        System.out.println("¿Quién eres?");
        completeName = scanned.nextLine();

        System.out.println("El nombre completo es: " + completeName);
    }
}
