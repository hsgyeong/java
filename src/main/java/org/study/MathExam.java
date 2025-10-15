package org.study;

public class MathExam {

    public static void main(String[] args) {
        // 큰 값
        int value1 = Math.max(5, 30);
        System.out.println(value1);

        // 작은 값
        int value2 = Math.min(5, 30);
        System.out.println(value2);

        // 절대값
        System.out.println(Math.abs(-10));

        // 랜덤
        System.out.println(Math.random());  // 랜덤은 리턴 값이 double 타입이다. (0 이상 ~ 1.0 미만의 랜덤한 실수 값을 구함)

        // 제곱근
        System.out.println(Math.sqrt(25));
    }
}
