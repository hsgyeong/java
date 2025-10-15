package org.study;

public class WrapperExam {

    public static void main(String[] args) {

        int i = 5;      // 기본형 타입 -> 객체(참조형)이 아니다.
        Integer i2 = new Integer(5);    // int를 객체로 바꿔주는 wrapper 클래스 중 하나
                                                // new Integer -> deprecated (java9 ~)
        Integer i3 = 5;     // new Integer(5);  -> 오토박싱

        int i4 = i3.intValue();
        int i5 = i3;        // 오토언박싱

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
    }
}
