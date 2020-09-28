package com.company;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int count=0;

    private static void input(Queue<Integer> queue){
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<5; i++){
            int n = scanner.nextInt();
            queue.add(n);
        }
        System.out.println(queue);
    }

    private static void game(Queue<Integer> pl1, Queue<Integer> pl2) {
        Queue<Integer> common = new ArrayDeque<Integer>();
        while(!pl1.isEmpty() && !pl2.isEmpty() && count<106){
            if(pl1.peek() > pl2.peek() && pl1.peek() - pl2.peek() != 9 || pl2.peek()-pl1.peek()==9){
                int n = pl1.peek();
                pl1.poll();
                pl1.add(pl2.poll());
                pl1.add(n);
                while (!common.isEmpty()){
                    pl1.add(common.poll());
                }
            }
            else if(pl2.peek() > pl1.peek() || pl1.peek()-pl2.peek()==9){
                int n = pl2.peek();
                pl2.poll();
                pl2.add(pl1.poll());
                pl2.add(n);
                while (!common.isEmpty()){
                    pl2.add(common.poll());
                }
            }
            else if(pl2.peek() == pl1.peek()){
                common.add(pl1.poll());
                common.add(pl2.poll());
            }
            count++;
        }
    }

    private static  void show(Queue<Integer> pl1, Queue<Integer> pl2){
        if(pl1.isEmpty() && !pl2.isEmpty()){
            System.out.println("Second");
        }
        else if(!pl1.isEmpty() && pl2.isEmpty()){
            System.out.println("First");
        }
        else{
            System.out.println("Botva");
        }
        System.out.println("Количество ходов: "+count);
    }

    public static void main(String[] args) {
        Queue<Integer> queue_player1 = new ArrayDeque<>();
        Queue<Integer> queue_player2 = new ArrayDeque<>();

        System.out.println("Введите 5 чисел для первого игрока");
        input(queue_player1);
        System.out.println("Введите 5 чисел для второго игрока");
        input(queue_player2);

        game(queue_player1, queue_player2);
        show(queue_player1, queue_player2);
    }
}
