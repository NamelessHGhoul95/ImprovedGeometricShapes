package com.kodigo.GeometricShapes;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@NoArgsConstructor
public class EquilateralTriangle extends Triangle implements Perimeter{
    private double perimeter;

    @Override
    public double calculatePerimeter(ArrayList<Double> sides) {
        sideA = sides.get(0);
        sideB = sides.get(1);
        sideC = sides.get(2);
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }

}
