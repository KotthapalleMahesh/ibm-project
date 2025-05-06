package com.ibm.Thread.threads;
public class Anonymous {
    public static void workload() {
        for (int current = 0; current <= 10; current++) {
            System.out.println(Thread.currentThread() + " " + current);
            }}

    public void run() {
        workload();
    }
       


    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread thread1 = new Thread(runner);

        System.out.println("State before start: " + thread1.getState());
        thread1.start();
        System.out.println("State after start: " + thread1.getState());

        try {
            thread1.join(); // wait for thread1 to die
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




