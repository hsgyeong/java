package org.study;

public class MusicBox {
    public synchronized void playMusicA() {
        for(int i = 0; i < 10; i++) {
            System.out.println("신나는 음악");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void playMusicB() {
        for(int i = 0; i < 10; i++) {
            System.out.println("슬픈 음악");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void playMusicC() {
        for(int i = 0; i < 10; i++) {
            synchronized (this) {   // 현재 객체가 모니터링락을 가질 수 있을 경우에 모니터링락을 가지게 되서 동기화하겠다라는 의미  따라서 정말 필요한 부분만 동기화
                System.out.println("재즈 음악");
            }

            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
