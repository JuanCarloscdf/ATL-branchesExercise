package clase6;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un pais");
        String country = scanner.nextLine();
        System.out.println("Introduzca un twiter topic");
        String topic = scanner.nextLine();
        System.out.println("Introduzca un numero de trelefono ej 59173080372");
        String cellphoneNumber = scanner.nextLine();
        System.out.println("https://www.google.com/maps/search/" + country);
        System.out.println("https://twitter.com/search?q=" + topic);
        System.out.println("https://api.whatsapp.com/send?phone=" + cellphoneNumber);
    }
}
