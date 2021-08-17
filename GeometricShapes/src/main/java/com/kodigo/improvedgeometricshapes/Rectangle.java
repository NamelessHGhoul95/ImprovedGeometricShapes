package com.kodigo.improvedgeometricshapes;

public class Rectangle extends GeometricShapes{
    public double b;
    public double h;

    public Rectangle(String name, double b, double h) {
        super(name);
        this.b = b;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        area = b * h;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = b + b + h + h;
        return perimeter;
    }
}
