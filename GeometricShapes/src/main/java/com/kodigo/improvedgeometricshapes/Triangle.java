package com.kodigo.improvedgeometricshapes;

public class Triangle extends GeometricShapes{
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}
