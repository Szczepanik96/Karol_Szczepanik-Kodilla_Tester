package com.kodilla.collections.adv.maps.homework;
import java.util.List;

public class School {
    private List<Integer> numberOfStudents;
    private String nameOfClass;
    public School(List<Integer> numberOfStudents, String nameOfClass){
        this.numberOfStudents = numberOfStudents;
        this.nameOfClass = nameOfClass;
    }
    public int getNumberOfAllStudents(){
        int sum = 0;
        for(Integer allStudents : numberOfStudents){
            sum += allStudents;
        }return sum;
    }
    public String getNameOfClass(){
        return nameOfClass;
    }
}