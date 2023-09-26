package Clase5;

import java.util.Scanner;

public class dogAgeCalculator {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual es tu edad?");
        int humanAge = input.nextInt();
        int dogAge = humanAge * 7;
        System.out.println("Tu edad en años de perrito es: " + dogAge);
    }
}
