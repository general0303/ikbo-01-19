package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String regex = "(\\w+)@(\\w+\\.)(\\w+)" ;
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        Pattern p2 = Pattern. compile (regex);
        Matcher m2 = p2.matcher(email);
        boolean b = m2.matches();
        if (b) System.out.print("это email");
        else System.out.println("это не email");
    }
}
