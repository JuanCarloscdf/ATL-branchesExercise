package Clase5;

import java.util.Scanner;

public class guessNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double randomNumber = Math.random()*10;
        int roundedNumber =(int) Math.round(randomNumber);
        System.out.println("introduce un numero del 1 al 10");
        int userNumber = scanner.nextInt();
        if(roundedNumber == userNumber){
            System.out.println("felicidades adivinaste el numero secreto");
        }else{
            System.out.println("buhhh! el numero era:" + roundedNumber);
        }
    }
}
