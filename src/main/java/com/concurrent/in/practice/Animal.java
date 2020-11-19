package com.concurrent.in.practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public boolean isPotentialMate(Animal a) {
        return Boolean.TRUE;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("animal-1");
        Animal animal2 = new Animal("animal-2");
        Animal animal3 = new Animal("animal-3");
        Map<Integer, Animal>integerAnimalMap = new Hashtable<>();
        integerAnimalMap.put(1, animal1);
        integerAnimalMap.put(2, animal2);
        integerAnimalMap.put(3, animal3);
        System.out.println(integerAnimalMap.get(10).getName());
    }
}
