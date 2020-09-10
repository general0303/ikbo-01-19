package com.company;

public class Square extends Rectangle {

    protected double side;

    public Square(){}

    public Square(double side, String color, boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setWidth(double side){
        this.width=side;
    }

    @Override
    public void setLength(double side){
        this.length=side;
    }

    @Override
    public String toString() {
        return "side: " + side + ", color" + color + ", filled: " + filled;
    }
}
