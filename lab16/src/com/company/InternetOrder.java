package com.company;

public class InternetOrder implements Order{
    private int size;
    private ListNode head;
    private ListNode tail;

    private static class ListNode{
        private ListNode next;
        private MenuItem value;
    }

    @Override
    public boolean add(MenuItem item) {
        return false;
    }

    @Override
    public String[] itemNames() {
        return new String[0];
    }

    @Override
    public int itemQuantity() {
        return 0;
    }

    @Override
    public int itemQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public MenuItem[] getItems() {
        return new MenuItem[0];
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {
        return 0;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        return new MenuItem[0];
    }

    @Override
    public int costTotal() {
        return 0;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer() {

    }
}
