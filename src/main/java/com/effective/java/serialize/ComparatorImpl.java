package com.effective.java.serialize;


import java.util.Comparator;
import java.util.Vector;

public class ComparatorImpl implements Comparator<Long> {

    @Override
    public int compare(Long aLong, Long t1) {
        return 0;
    }

    public static void main(String[] args) {
        Long a = 10L;
        Comparator comparator = new ComparatorImpl();
        System.out.println(comparator.compare(a,11L));
    }
    Vector<Integer> integerVector = new Vector<>();

}
