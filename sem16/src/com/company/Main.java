package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int money=0;
	    Order[] orders = new Order[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1, если хотите создать заказ, иначе 0");
        int f = scanner.nextInt();
        int n = 0;
        while (f==1){
            System.out.println("Введите число полей в заказе");
            int size = scanner.nextInt();
            Order order = new Order(size);
            for (int i=0; i<size; i++) {
                System.out.println("Введите 1, если хотите добавить напиток, иначе 0");
                int p = scanner.nextInt();
                System.out.print("Название: ");
                String name = scanner.next();
                System.out.print("Описание: ");
                String description = scanner.next();
                System.out.print("Цена: ");
                int cost = scanner.nextInt();
                if (p==1){
                    Drink drink = new Drink(name, description, cost);
                    order.addDrink(drink);
                }
                else {
                    Dish dish = new Dish(name, description, cost);
                    order.addDish(dish);
                }
            }
            orders[n] = order;
            n++;
            System.out.println("Введите 1, если хотите создать заказ, иначе 0");
            f = scanner.nextInt();
        }
        n = 0;
        while (orders[n] != null){
            for (Drink drink : orders[n].drinks) {
                if (drink != null)
                    money += drink.getCost();
            }
            for (Dish dish : orders[n].dishes) {
                if (dish != null)
                    money += dish.getCost();
            }
            n++;
        }
        System.out.print("За день кафе заработало " + money + "$");
    }
}
