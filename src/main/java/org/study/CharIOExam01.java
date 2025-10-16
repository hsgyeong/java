package org.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 키보드로부터 한줄씩 입력 받을 수 있는 부분
        String line = null;
       try {
           line = br.readLine();
       } catch (IOException e) {
            e.printStackTrace();
       }
        System.out.println(line);
    }
}
