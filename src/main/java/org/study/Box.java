package org.study;

public class Box<E> {   // Box는 가상클래스 E를 사용함. 실제 존재하는 클래스가 아님. -> generic 사용
    private E obj;

    public void setObj (E obj) {
        this.obj = obj;     // 매개변수로 들어온 obj와 필드의 obj가 같다. this 키워드를 사용해 obj 값을 설정한다.
    }

    public E getObj () {
        return obj;
    }
}
