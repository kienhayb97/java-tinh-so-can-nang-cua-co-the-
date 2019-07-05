package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height;
        System.out.println("Your weight (in kilogam):");
        weight = scanner.nextDouble();
        System.out.println("Your height (in meter):");
        height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.println(bmi + " is Underweight");
        else if (bmi < 25)
            System.out.println(bmi + " is Normal");
        else if (bmi < 30)
            System.out.println(bmi + " is Overweight");
        else
            System.out.println(bmi + " is Obese");
    }
}
