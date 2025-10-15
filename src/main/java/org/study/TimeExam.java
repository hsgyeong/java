package org.study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        // 2025년 4월 23일의 시간에 대한 정보를 가지는 LocalDate객체 생성
        LocalDate ldt = LocalDate.of(2025, Month.APRIL, 23);
        System.out.println(ldt);

        // 17시 18분에 대한 LocalTime 객체
        LocalTime ltm = LocalTime.of(17, 18);
        System.out.println(ltm);
        
        // 10시 22분 15초라는 문자열에 대한 LocalTime 객체
        LocalTime ltm2 = LocalTime.parse("10:22:15");
        System.out.println(ltm2);

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        System.out.println(timePoint.getMonth());
        System.out.println(timePoint.getMonthValue());
    }
}
