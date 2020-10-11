package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder number= new StringBuilder("+");
        String s = scanner.next();
        if (s.charAt(0)=='8') number.append('7');
        for (int i=1; i<s.length(); i++){
            if (s.length()-i==7 || s.length()-i==4) number.append('-');
            number.append(s.charAt(i));
        }
        System.out.println(number);
    }
}
