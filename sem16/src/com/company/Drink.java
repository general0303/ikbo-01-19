package com.company;

public class Drink implements Item{

    private String name;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    private String description;
    private int cost;

    Drink(String name, String description, int cost){
        this.cost=cost;
        this.description=description;
        this.name=name;
    }
}
