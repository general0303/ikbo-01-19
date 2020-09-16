package com.company;

import java.awt.*;
import java.util.Random;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, Color color) {
        super(x, y, color);
    }
    @Override
    public void draw2(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        Random r=new Random();
        g2.fillRect(getX(),getY(),(int)(r.nextInt(100)),(int)r.nextInt(100));
    }
}
