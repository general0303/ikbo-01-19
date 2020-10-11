package com.company;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    public void enqueue(T element) {
        arrayList.add(element);
    }

    public T element() {
        return arrayList.get(0);
    }

    public T dequeue() {
        T a = arrayList.get(0);
        arrayList.remove(0);
        return a;
    }

    public void clear() {
        arrayList = new ArrayList<>();
    }

    public int size() {
        return arrayList.size();
    }

    public boolean isEmpty() {
        return arrayList.size() == 0;
    }
}
