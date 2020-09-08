package com.company;

import java.util.Scanner;

public class Main {

    public static int factorial(int n){
        int result = 1;
        for (int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(factorial(n));
    }
}
