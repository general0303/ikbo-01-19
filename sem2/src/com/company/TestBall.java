package com.company;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        ball.move(10, 1);
        ball.move(0,5);
        System.out.print(ball.toString());
    }
}
