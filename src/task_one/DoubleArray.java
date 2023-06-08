package task_one;


import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.round;

public class DoubleArray {
    private double[] array;

    public DoubleArray(int length) {
        array = new double[length];

        for (int i = 0; i < length; i++) {
            array[i] = Math.random() * 10;
        }
    }

    Scanner scanner = new Scanner(System.in);

    public DoubleArray() {

    }

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

    public void sortingOriginalArrayInAscendingOrder(int[] integerArray) {
        {
            System.out.println("Integer array (with rounding):");
            for (int num : integerArray) {
                System.out.print(Math.round(num) + " ");
            }
            System.out.println();
        }
    }

    void sortOriginalArray
            () {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Перестановка элементов массива
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void printSumOfPositiveNumbers
            () {
        double sum = 0;
        for (double num : array) {
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
    }

}
