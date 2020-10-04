package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Client cl = new Client(scan.nextLine(), scan.next());
        } catch (BadINNException e) {
            e.printStackTrace();
        }
    }
}
