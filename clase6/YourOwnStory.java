package clase6;

import java.util.Scanner;

public class YourOwnStory {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String story = "";
        System.out.println("debes escoger una opcion escribiendo 1 o 2");
        System.out.println("1.- en la noche ");
        System.out.println("2.- en la mañana ");
        int option1 = scanner.nextInt();
        if(option1 == 1){
            story = story + "en la noche " ;
        }else if(option1 == 2){
            story = story + "en la mañana ";
        }
        System.out.println("debes escoger una opcion escribiendo 1 o 2");
        System.out.println("1.- comimos mucho y bailamos");
        System.out.println("2.- dormimos y vimos una peli");
        int option2 = scanner.nextInt();
        if(option1 == 1){
            story = story + "comimos mucho y bailamos";
        }else if(option1 == 2){
            story = story + "dormimos y vimos una peli";
        }

        System.out.println(story);
    }
}
