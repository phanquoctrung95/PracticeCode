package com.effective.java.serialize;

import java.util.*;

public class ItWarm {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,1,2,2,3,4,22,3);
        Set<Integer> integerSet = new HashSet<Integer>();
        for (Integer integer : integerList) {
            Boolean isAbsent = integerSet.add(integer);
            if (!isAbsent) {
                integerSet.remove(integer);
            }
        }

        for (Integer el : integerSet) {
            System.out.println(el.intValue());
        }
    }
}
