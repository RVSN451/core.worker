package com.kostakov.core.worker;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listenerOn = System.out::println;
        OnTaskErrorListener listenerOff = System.out::println;
        Worker sheepCounter = new Worker(listenerOn, listenerOff);
        sheepCounter.countSheep(50);
    }
}
