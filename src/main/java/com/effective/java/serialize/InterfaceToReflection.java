package com.effective.java.serialize;

import java.util.Arrays;
import java.util.Set;

public class InterfaceToReflection {
    public static void main(String[] args) {
// Translate the class name into a Class object
        Class<?> cl = null;
        try {
            cl = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found.");
            System.exit(1);
        }
// Instantiate the class
        Set<String> s = null;
        try {
            s = (Set<String>) cl.newInstance();
        } catch (IllegalAccessException e) {
            System.err.println("Class not accessible.");
            System.exit(1);
        } catch (InstantiationException e) {
            System.err.println("Class not instantiable.");
            System.exit(1);
        }
// Exercise the set
        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }
}