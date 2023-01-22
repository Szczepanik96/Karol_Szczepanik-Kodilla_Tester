package com.kodilla.Abstract;

public class Duck extends Animal{

    public Duck(int numberOfLegs) {
        super(2);
    }

    @Override
    public void getVoice() {
        System.out.println("Qwa Qwa Qwa");
    }
}