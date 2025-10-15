package org.study;

public class BoxExam {

    public static void main(String[] args) {
/*        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("hello");
        String str = (String)box.getObj();
        System.out.println(str);

        box.setObj(1);
        int value = (int)box.getObj();*/

        Box<Object> box = new Box<>();      // 어떤 Object든 받아서 사용 가능
        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> box2 = new Box<>();     // 문자열만 설정 가능 (형변환 필요 X)
        box2.setObj("hello");
        String str = box2.getObj();

        Box<Integer> box3 = new Box<>();    // Integer만 설정 가능 (형변환 필요 X)
        box3.setObj(4);
        int v2 = box3.getObj();
    }
}
