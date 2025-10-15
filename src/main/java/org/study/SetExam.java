package org.study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("dori");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("dori");

        System.out.println(set1.size());
        System.out.println(flag1);  // true
        System.out.println(flag2);  // true
        System.out.println(flag3);  // false (같은 값이 중복되었기 때문)

        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()) {     // iterator가 제공하는 hasNext라는 메서드를 이용하면 데이터가 있는 동안만 true 리턴
            String str = iter.next();
            System.out.println(str);
        }
    }
}
