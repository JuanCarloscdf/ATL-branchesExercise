package clase6;

import java.util.Random;
import java.util.Scanner;

public class StonePaperOrSccisor {
    public static void main(String[] args){

        String[] wins = {"02","10","21"};
        String[] loses = {"01","12","20"};
        String[] ties = {"00","11","22"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("escoge 0 piedra 1 papel o 2 tijera");
        String user = scanner.nextLine();
        Random randomNumber = new Random();
        int machinePlay = randomNumber.nextInt(3);
        String played = user + String.valueOf(machinePlay);
        System.out.println(played);

        for(String win : wins){
            if(played.equals(win)){
                System.out.println("ganaste");
            }
        }
        for(String lose : loses){
            if(played.equals(lose)){
                System.out.println("perdiste");
            }
        }
        for(String tie : ties){
            if(played.equals(tie)){
                System.out.println("empate");
            }
        }
    }
    //0 piedra 1 papel 2 tijera
    // gana[02,10,21] pierde[01,12,20] empate[1,22,]
}
