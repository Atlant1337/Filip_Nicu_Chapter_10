package com.company;

public abstract class TwoDimensionalShape extends Shape
{
    private double area;


    public double getArea() {
        return area;
    }

    public abstract double calculateArea();


}