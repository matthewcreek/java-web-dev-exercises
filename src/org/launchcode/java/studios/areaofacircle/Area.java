package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        boolean isDouble = input.hasNextDouble();
        if (isDouble) {
            double radius = input.nextDouble();
            while (radius < 0) {
                System.out.println("Enter a valid (positive) radius: ");
                radius = input.nextDouble();
            }
            double area = Circle.getArea(radius);
            System.out.println(area);
        } else {
            System.out.println("Radius must be a number.");
        }
        input.close();
    }
}
