package com.teachmeskills.lesson8.part1.task1.model;

public sealed abstract class Figure permits Triangle, Rectangle, Circle {
    public abstract double getPerimeter();
    public abstract double getArea();
}
