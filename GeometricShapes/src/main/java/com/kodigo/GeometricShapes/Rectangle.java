package com.kodigo.GeometricShapes;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@NoArgsConstructor
public class Rectangle extends Square implements Perimeter, Area{
    protected double perimeter;
    protected double area;

    @Override
    public double calculatePerimeter(ArrayList<Double> sides) {
        b = sides.get(0);
        h = sides.get(1);
        perimeter = b + b + h + h;
        return perimeter;
    }

    @Override
    public double calculateArea(ArrayList<Double> data) {
        b = data.get(0);
        h = data.get(1);
        area = b * h;
        return area;
    }
}
