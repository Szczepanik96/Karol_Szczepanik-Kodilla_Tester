package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stampSet = new HashSet<>();

        stampSet.add(new Stamp("Vatican",2.5,true));
        stampSet.add(new Stamp("France",2.4,false));
        stampSet.add(new Stamp("Poland",2.5,false));
        stampSet.add(new Stamp("Germany",1.9,true));
        stampSet.add(new Stamp("Belgium",2.7,false));
        stampSet.add(new Stamp("USA",3.1,true));
        stampSet.add(new Stamp("Canada",2.1,false));
        stampSet.add(new Stamp("Belgium",2.7,false));
        stampSet.add(new Stamp("USA",3.1,true));
        stampSet.add(new Stamp("Canada",2.1,false));

        System.out.println("Collection of stamps and number of unique elements: " + stampSet.size());
        System.out.println("-----------------------------------------------------------");

        for(Stamp stamps : stampSet){
            System.out.println(stamps);
        }
    }
}