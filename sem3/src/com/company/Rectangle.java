package com.company;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle(){}

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        {
            return "length: " + length + ", width: " + width + ", color" + color + ", filled: " + filled;
        }
    }
}
