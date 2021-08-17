package com.kodigo.GeometricShapes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double result;

        //Creating values of a rectangle
        ArrayList<Double> list = new ArrayList<>();
        list.add(3.50D); // Base
        list.add(8D); // Altura

        //Creating rectangle
        Rectangle rectangle = new Rectangle();
        result = rectangle.calculateArea(list);
        System.out.println("The Area of the rectangle is: " + result);

        //Creating values for calculating the Area of a rectangle
        result = rectangle.calculatePerimeter(list);
        System.out.println("The perimeter of the rectangle is: " + result);

    }
}
