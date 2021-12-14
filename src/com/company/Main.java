package com.company;
//MULTITHREADING
public class Main{

    public static void main(String[] args) {
        Thread obj= Thread.currentThread();
        System.out.println(obj.getName());
        obj.setName("ABC");
        obj.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj.getId());
        System.out.println(obj.isAlive());
        System.out.println(obj.getPriority());
        System.out.println(obj.isDaemon());
    }
}
