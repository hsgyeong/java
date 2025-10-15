package org.study;

import java.util.Objects;

public class Student {
    String name;
    String number;
    int birthYear;

    // 메서드의 파라미터로 들어온 object와 자기 자신을 비교함
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    // equals와 hashCode는 사용자가 알맞게 오버라이딩 해서 사용해야 한다.
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "김도리";
        s1.number = "1234";
        s1.birthYear = 2021;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 2024;

        if(s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
