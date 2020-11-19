package com.concurrent.in.practice;

import java.util.HashSet;
import java.util.Set;

public class Immutability {
//    @Immutable
    public final class ThreeStooges {
        private final Set<String> stooges = new HashSet<String>();
        public ThreeStooges() {
            stooges.add("Moe");
            stooges.add("Larry");
            stooges.add("Curly");
        }
        public boolean isStooge(String name) {
            return stooges.contains(name);
        }

    }
}
