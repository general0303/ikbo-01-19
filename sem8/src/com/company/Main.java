package com.company;

public class Main {

    public static void main(String[] args) {
	    BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(5);
	    boundedWaitList.add(5);
        boundedWaitList.add(6);
        boundedWaitList.add(7);
        boundedWaitList.add(8);
        boundedWaitList.add(9);
        boundedWaitList.add(10);
        System.out.println(boundedWaitList);
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(5);
        unfairWaitList.add(6);
        unfairWaitList.add(7);
        unfairWaitList.add(8);
        unfairWaitList.add(9);
        unfairWaitList.add(10);
        unfairWaitList.remove(7);
        System.out.println(unfairWaitList);
    }
}
