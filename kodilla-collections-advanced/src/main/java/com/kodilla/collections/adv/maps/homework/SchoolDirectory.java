package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();

        Principal sprout = new Principal("Pomona Sprout");
        Principal severus = new Principal("Severus Snape");
        Principal mcgonagall = new Principal("Minerwa McGonagall");
        Principal flitwick = new Principal("Filius Flitwick");

        School gryffindor = new School(Arrays.asList(105,74,84,95),"Gryffindor,tutor of classes from 96 to 99 ");
        School hufflepuff = new School(Arrays.asList(95,84,73,92),"Hufflepuff,tutor of classes from 96 to 99 ");
        School ravenclaw = new School(Arrays.asList(85,74,120,73),"Ravenclaw,tutor of classes from 96 to 99 ");
        School slytherin = new School(Arrays.asList(109,92,80,79),"Slytherin,tutor of classes from 96 to 99 ");

        schoolMap.put(mcgonagall,gryffindor);
        schoolMap.put(severus,slytherin);
        schoolMap.put(sprout,hufflepuff);
        schoolMap.put(flitwick,ravenclaw);

        System.out.println("------------------------------------------------------------------------------------------------------------");

       for(Map.Entry<Principal,School> schoolEntry : schoolMap.entrySet()){
           System.out.println(schoolEntry.getKey().getDirectory() + " Director of " +
                   schoolEntry.getValue().getNameOfClass() +
                   " Number of all students in school: " +
                   schoolEntry.getValue().getNumberOfAllStudents());
       }
    }
}