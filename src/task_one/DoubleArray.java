package task_one;


import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.round;

public class DoubleArray {
    Scanner scanner = new Scanner(System.in);

    public void methodThatDiscardsFractionalPart() {
        System.out.println("Введите число");
        double numder = scanner.nextDouble();

        int numderInt = (int) numder;
        System.out.println("Вот ваше число");
        System.out.println(numderInt);
    }

    public void methodDiscardingFractionalPartAndRounding() {
        System.out.println("Введите число");
        double numder = scanner.nextDouble();
        double m = numder - (int) numder;
        if (m < 0.5) {
            int numderInt = (int) numder;
            System.out.println("Вот ваше число");
            System.out.println(numderInt);
        } else {
            int numderInt = (int) numder + 1;
            System.out.println("Вот ваше число");
            System.out.println(numderInt);

        }
    }
    public void sortingOriginalArrayInAscendingOrder(){
        
    }
}
