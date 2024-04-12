package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Object, Integer> countElements(Object[] array) {
        Map<Object, Integer> map = new HashMap<>();
        for (Object o : array) {
            Integer count = 1;
            if (map.containsKey(o)) {
                count = map.get(o);
                count++;
            }
            map.put(o, count);
        }
        return map;
    }


    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11, 12, 12, 14, 15, 15, 15, 15, 15, 25};
        System.out.println(countElements(array));
    }
}