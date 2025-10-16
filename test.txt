package org.study;

import java.io.*;

public class CharIOExam02 {

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/org/study/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("test.txt"));   // 데코레이터패턴
            String line = null;
            while((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {     // IO는 열어줬으면 반드시 닫아야 한다.
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
