package org.study;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 밥을 먹습니다.");
    }
}
