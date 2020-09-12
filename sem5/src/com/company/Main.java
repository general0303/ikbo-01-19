package com.company;

import java.util.Scanner;

public class Main {

    private static void task12(){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        if (n%2!=0) System.out.println(n);
        if (n!=0) task12();
    }

    private static String task14(int n){
        if (n<10) return Integer.toString(n);
        else return task14(n/10) + " " + n%10;
    }

    private static void task2(int k, int n){
        System.out.print(k + " ");
        if (k<n) task2(k+1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        task2(1, n);
    }
}
