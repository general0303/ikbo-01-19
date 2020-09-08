package com.company;

public class FurnitureShop {

    private int money=1000;
    private int count_sofa=5;
    private int count_table=10;

    public void sale(int n){
        Sofa sofa = new Sofa();
        Table table = new Table();
        int m=0;
        if (n==0){
            m=sofa.getPrice();
            count_sofa--;
        }
        else{
            m=table.getPrice();
            count_table--;
        }
        money+=m;
        System.out.print("Вы получили " + m + "$, ваш бюджет: " + money + "$");
    }
}
