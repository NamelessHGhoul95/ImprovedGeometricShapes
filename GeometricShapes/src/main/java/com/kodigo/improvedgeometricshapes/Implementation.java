package com.kodigo.improvedgeometricshapes;

public class Implementation {
    public static void main(String[] args) {

        Triangle triangle = new Triangle("Triangulo Equilatero",5,5,5);
        System.out.println("El area del triangulo es: " + triangle.calculateArea());
        System.out.println("El perimetro del triangulo es: " + triangle.calculatePerimeter());


        Rectangle rectangle = new Rectangle("Rectangulo",7.5,10);
        System.out.println("El area del Rectangulo es: " + rectangle.calculateArea());
        System.out.println("El perimetro del Rectangulo es: " + rectangle.calculatePerimeter());
    }
}
