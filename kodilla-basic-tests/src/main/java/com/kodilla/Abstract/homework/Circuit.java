package com.kodilla.Abstract.homework;

public class Circuit extends Shape {

    private final double height;
    private final double width;

    public Circuit(double height, double width) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double shapeArea() {
        return 0;
    }

    @Override
    public double circuit() {
        return (this.height + this.width) * 2;
    }
}
