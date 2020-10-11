package com.company;

public class Drink extends MenuItem implements Alcoholable{
    private double alcoholVol;

    @Override
    public boolean isAlcoholicDrink() {
        if (alcoholVol>0)
            return true;
        return false;
    }

    @Override
    public double AlcoholVol() {
        return 0;
    }
}
