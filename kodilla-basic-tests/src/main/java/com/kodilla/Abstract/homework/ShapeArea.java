package com.kodilla.Abstract.homework;

public class ShapeArea extends Shape {

    private final double height;
    private final double width;

    public ShapeArea(double height, double width) {

        this.height = height;
        this.width = width;
    }

    @Override
    public double shapeArea() {
        return this.height * this.width;
    }

    @Override
    public double circuit() {
        return 0;
    }
}