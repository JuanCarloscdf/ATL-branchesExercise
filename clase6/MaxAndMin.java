package clase6;

import java.util.Scanner;

public class MaxAndMin {
    public static void main (String [] args){
        double min = 999999999 ,max = 0;
        double[] numbers  = new double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("numero 1");
        numbers[0] = scanner.nextDouble();
        System.out.println("numero 1");
        numbers[1] = scanner.nextDouble();
        System.out.println("numero 1");
        numbers[2] = scanner.nextDouble();
        for (double number : numbers) {
            System.out.println(number);
            min = Math.min(number, min);
            max = Math.max(number, max);
        }
        System.out.println(min+"-->"+max);    }
}
