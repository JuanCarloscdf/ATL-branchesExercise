package clase8;

import java.util.Scanner;

public class squareArea {
    public static void main(String[] args){
        Double[] data = new Double[2];
        getData(data);
        Double area = triangleAreaCalculator(data[0],data[1]);
        System.out.println(area);
        doubleArrayPinter(data);
    }

    private static void getData(Double[] data){
        Scanner scanner = new Scanner(System.in);
        for (int i=0 ;i<data.length;i++){
            System.out.println("introdice el dato" + i);
            data[i] = scanner.nextDouble();
        }
    }
    private static double triangleAreaCalculator(Double side,Double height){
        return side*height*0.5;
    }
    private static void doubleArrayPinter (Double[] datas){
        for (Double data:datas){
            System.out.println(data);
        }
    }
}
