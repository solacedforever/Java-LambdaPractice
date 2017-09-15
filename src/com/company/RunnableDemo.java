package com.company;

public class RunnableDemo {
    public static void main(String[] args) {

        Runnable anonRun = new Runnable() {
            @Override
            public void run(){
                System.out.println("Anonymous run");
            }
        };

        anonRun.run();

        Runnable lambdaRun = () -> System.out.println("lambda run");

        lambdaRun.run();

    }
}
