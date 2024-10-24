package org.example;

import java.util.Random;


public class RandomNumber implements Runnable{
    @Override
    public void run() {
        System.out.println("Welcome to "+Thread.currentThread().getName());
        int n = 0;
        Random r = new Random();
        while (n < 5){
            try {
                Thread.sleep(r.nextLong(10,500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            n++;
        }
        System.out.println("Goodbye "+Thread.currentThread().getName());
    }
}
