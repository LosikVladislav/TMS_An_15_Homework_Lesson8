package com.teachmeskills.lesson8.part1.task1.model;

public final class Rectangle extends Figure{
    private double sideFirst, sideSecond;

    public Rectangle(double sideFirst, double sideSecond) {
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
    }

    @Override
    public double getPerimeter() {
        return (sideFirst + sideSecond)*2;
    }

    @Override
    public double getArea() {
        return (sideFirst * sideSecond);
    }
}
