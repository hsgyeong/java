package org.study;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {
    // close 메서드를 호출하지 않더라도 exception이 발생하지 않았다면 자동으로 close
    public static void main(String[] args) {
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
                ){
            out.writeInt(100);      // 4byte
            out.writeBoolean(true); // 1byte
            out.writeDouble(50.5);  // 8byte
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
