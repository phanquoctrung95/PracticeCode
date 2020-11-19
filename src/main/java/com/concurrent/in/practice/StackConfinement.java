package com.concurrent.in.practice;//package com.ConcurrencyInPractice;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Collection;
//import java.util.SortedSet;
//import java.util.TreeSet;
//
//public class StackConfinement {
//    public int loadTheArk(Collection<Animal> candidates) {
//        SortedSet<Animal> animals;
//        int numPairs = 0;
//        Animal candidate = null;
//        // animals confined to method, don’t let them escape!
//        animals = new TreeSet<Animal>(new SpeciesGenderComparator());
//        animals.addAll(candidates);
//        for (Animal a : animals) {
//            if (candidate == null || !candidate.isPotentialMate(a))
//                candidate = a;
//            else {
////                ark.load(new AnimalPair(candidate, a));
//                ++numPairs;
//                candidate = null;
//            }
//        }
//        return numPairs;
//    }
//    private static ThreadLocal<Connection> connectionHolder
//            = new ThreadLocal<Connection>() {
//        public Connection initialValue() {
//            return DriverManager.getConnection("DB_URL");
//        }
//    };
//    public static Connection getConnection() {
//        return connectionHolder.get();
//    }
//}
