package com.kodilla.Abstract;

public class Dog extends Animal{

    public Dog(int numberOfLegs) {
        super(4);
    }

    @Override
    public void getVoice() {
        System.out.println("Wof Wof Wof");
    }
}
