package org.study;

public class ThreadExam {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        t1.start();
        t2.start();

        System.out.println("main end.");
        // 메인 thread가 종료되면 프로그램이 종료되는 것이 아니라,
        // 메인 thread가 종료되었다 하더라도 다른 모든 thread들이 종료되어야지만 프로그램이 종료된다.
    }
}
