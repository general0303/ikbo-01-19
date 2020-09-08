package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureShop furnitureShop = new FurnitureShop();
        int n = scanner.nextInt();
        furnitureShop.sale(n);
    }
}
