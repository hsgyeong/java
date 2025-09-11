package org.study;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("apple", 5); // 기존 키 apple 덮어씀
        System.out.println(map);
    }
}
