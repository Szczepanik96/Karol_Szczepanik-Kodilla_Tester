package com.kodilla.jacoco;

public class Year {
    int yearNumber;

    public Year(int year) {
        this.yearNumber = year;
    }

    public boolean isLeap() {
        return this.yearNumber % 4 == 0 && (this.yearNumber % 100 != 0 || this.yearNumber % 400 == 0);
    }
}

