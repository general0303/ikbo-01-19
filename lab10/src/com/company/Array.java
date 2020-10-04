package com.company;

import java.util.Arrays;

public class Array<T> {
    private T[] array;
    private int currentData;
    Array(int size)
    {
        array = (T[]) new Object[size];
        currentData = 0;
    }
    void add(T element)
    {
        array[currentData++] = element;
    }
    T get(int index)
    {
        return array[index];
    }
    void clear()
    {
        Arrays.fill(array,null);
    }
    void arrayOut()
    {
        for (T element:array)
            System.out.println(element);
    }
}
