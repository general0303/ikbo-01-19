package com.company;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
	    Book book = new Book();
	    Scanner scanner = new Scanner(System.in);
	    String tittle = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();
        book.setTittle(tittle);
        book.setAuthor(author);
        book.setYear(year);
        System.out.print("tittle: " + book.getTittle() + ", author: " + book.getAuthor() + ", year: " + book.getYear());
    }
}
