package org.study;

public class MyThread2 implements Runnable {        // runnable 인터페이스 구현 -> java는 단일 상속만 지원
    String str;
    public MyThread2(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(str);

            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
