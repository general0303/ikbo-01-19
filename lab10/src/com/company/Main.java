package com.company;

public class Main {

    public static void main(String[] args) {
	    Array<Integer> integerArray = new Array<>(5);
	    integerArray.add(1);
        integerArray.add(1);
        integerArray.add(1);
        integerArray.add(1);
        integerArray.add(1);
        integerArray.arrayOut();
        Array<String> stringArray = new Array<>(5);
        stringArray.add("aaa");
        stringArray.add("aaa");
        stringArray.add("aaa");
        stringArray.add("aaa");
        stringArray.add("aaa");
        stringArray.arrayOut();
    }
}
