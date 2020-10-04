package com.company;

public class Main {

    public static void main(String[] args) {
        Complex cmp1 = new Complex(0,1);
        Complex cmp2 = new ConcreteFactory().createComplex();
        cmp2.setImage(3);
        cmp2.setReal(1);
        System.out.println(cmp1);
        System.out.println(cmp2);

    }
}
