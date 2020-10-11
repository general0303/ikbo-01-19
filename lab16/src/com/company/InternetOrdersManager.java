package com.company;

public class InternetOrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public boolean add(Order order){
        return false;
    }
    public Order remove(){
        return null;
    }
    public Order order(){
        return null;
    }

    private static class QueueNode{
        private QueueNode next;
        private QueueNode prev;
        private Order value;
    }
}
