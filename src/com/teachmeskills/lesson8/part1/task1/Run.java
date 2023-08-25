package com.teachmeskills.lesson8.part1.task1;

import com.teachmeskills.lesson8.part1.task1.model.Figure;
import com.teachmeskills.lesson8.part1.task1.model.Rectangle;
import com.teachmeskills.lesson8.part1.task1.model.Triangle;
import com.teachmeskills.lesson8.part1.task1.model.Circle;

public class Run {
    public static void main(String[] args) {

        Figure[] figure = getFigure();
        showArea(figure);
        System.out.println("common perimeter " + getPerimetersSum(figure));
    }
    private static double getPerimetersSum(Figure[] arrayOfFigures){
        double sum = 0;
        for(int i = 0; i < arrayOfFigures.length; i++){
            sum += arrayOfFigures[i].getPerimeter();
        }
        return sum;
    }
    private static void showArea(Figure[] arrayOfFigures){
        for(int i =0; i < arrayOfFigures.length; i++){
            System.out.println(arrayOfFigures[i].getArea() + " is area of figure number " + (i+1));
        }
    }
    private static Figure[] getFigure(){
        Figure[] arrayOfFigures = new Figure[5];
        arrayOfFigures[0] = new Triangle(5.2,2.0,3.6);
        arrayOfFigures[1] = new Rectangle(10.4,26.3);
        arrayOfFigures[2] = new Circle(13.4);
        arrayOfFigures[3] = new Rectangle(29.7, 10);
        arrayOfFigures[4] = new Circle(2.0);
        return arrayOfFigures;
    }
}
