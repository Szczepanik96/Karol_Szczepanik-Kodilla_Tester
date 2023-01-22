package com.kodilla.Abstract.homework;

public class Application {

    public static void main(String[] args) {

        double height = 24.14;

        double width = 54.92;

        ShapeArea shapeArea = new ShapeArea(height, width);

        double area = shapeArea.shapeArea();

        System.out.println("This is a shape area " + area);

        Circuit circuit = new Circuit(height, width);

        double obw = circuit.circuit();

        System.out.println("This is a circuit " + obw);


    }
}
