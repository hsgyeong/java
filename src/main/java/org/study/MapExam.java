package org.study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "choi");
        map.put("003", "hong");

        map.put("001", "kang"); // 같은 키 중복

        System.out.println(map.size());

        // Map은 같은 키로 값이 또 들어왔을때 기존에 있던 값을 새로 들어온 값으로 바꾼다. 따라서 마지막에 들어온 값이 저장된다.
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();

        while(iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }
    }
}
