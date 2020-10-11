package com.company;

public class Order {

    private int size;
    public Drink[] drinks;
    public Dish[] dishes;

    Order(int size){
        this.size=size;
        dishes = new Dish[size];
        drinks = new Drink[size];
    }

    boolean addDrink(Drink drink){
        int i = 0;
        while (drinks[i] != null & i<size){
            i++;
        }
        if (i==size)
            return false;
        drinks[i]=drink;
        return true;
    }

    boolean addDish(Dish dish){
        int i = 0;
        while (dishes[i] != null & i<size){
            i++;
        }
        if (i==size)
            return false;
        dishes[i]=dish;
        return true;
    }
}
