package clase7;

import java.util.Scanner;

public class arreglos {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int min = 999999, max=0, ac=0;
        for (int i=0 ;i<5;i++){
            System.out.println("ingrese un numero");
            numbers[i] = scanner.nextInt();
        }
        for (int i=0 ;i<5;i++){
            System.out.println(numbers[i]);
            min = Math.min(numbers[i],min);
            max = Math.max(numbers[i],max);
            ac = numbers[i] + ac;
        }
        float prom = 0;
        prom = (float) (ac / numbers.length);
        System.out.println("el minimo es: " + min);
        System.out.println("el maximo es: " + max);
        System.out.println("el promedio es: " + prom);
    }
}
