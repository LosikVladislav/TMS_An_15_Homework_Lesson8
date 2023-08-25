package com.teachmeskills.lesson8.part1.task1.model;

public final class Circle extends Figure{
    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return 2 * PI * Math.pow(radius,2.0);
    }
}
