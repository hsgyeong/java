package org.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;     // 읽어들이기 위한 객체
        FileOutputStream fos = null;    // 쓰기 위한 객체

        try {       // 파일이 없을 경우 exception을 발생시키기 때문에 exception 처리를 해줘야 한다.
            fis = new FileInputStream("src/main/java/org/study/ByteExam1.java");
            fos = new FileOutputStream("byte.txt"); // 경로를 주지 않으면 프로젝트 밑에 생성된다.

            int readData = -1;
            while((readData = fis.read()) != -1) {
                fos.write(readData);
            }

        } catch (Exception e) {  // IO의 모든 객체는 인스턴스화 한 후 반드시 닫아줘야 한다.
            throw new RuntimeException(e);
        }  finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
