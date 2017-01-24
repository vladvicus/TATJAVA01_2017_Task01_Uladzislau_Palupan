package com.epam.polupan;

import java.util.Scanner;

public class Calc {
    static double inputDouble() {
        double x = 0;
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            System.out.println("You input not a real number");
            System.out.println("Input real number");

            sc = new Scanner(System.in);
        }
        x = sc.nextDouble();

        return x;
    }

    public static void main(String[] args) {


        System.out.println("Input first real  number --> a: ");
        double a = inputDouble();

        System.out.println("Input second real  number -->b: ");
        double b = inputDouble();

        System.out.println("Input second real  number -->c: ");
        double c = inputDouble();


        double result = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + (1 / Math.pow(b, 2));

        if (Double.isNaN(result)) {
            System.out.println("Negative  value under square root!! Or division 0/0!! Not a number!");
        } else if (Double.isInfinite(result)) {
            System.out.println("Positive  or  negative infinity!!");

        } else {

            System.out.printf("\n\t%10.4f", result);
        }

    }

}
