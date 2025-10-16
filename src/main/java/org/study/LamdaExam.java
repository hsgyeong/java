package org.study;

public class LamdaExam {

    public static void main(String[] args) {
//       new Thread(new Runnable() {  자바는 메서드만 전달할 수 있는 방법이 없기 때문에 매번 객체를 생성해서 매개변수로 전달해야 한다.
        new Thread(() -> {
                for(int i = 0; i < 10; i ++) {
                    System.out.println("hello");
                }
        }).start();
    }
}
