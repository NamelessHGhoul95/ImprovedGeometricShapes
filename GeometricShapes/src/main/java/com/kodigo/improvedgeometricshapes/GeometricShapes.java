package com.kodigo.improvedgeometricshapes;

public abstract class GeometricShapes {
    public String name;
    public double area;
    public double perimeter;

    public GeometricShapes(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
