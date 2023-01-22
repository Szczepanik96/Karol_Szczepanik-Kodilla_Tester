package com.kodilla.Abstract;

public class Application {
    public static void main(String[] args) {

        Dog dog = new Dog(4);
        dog.getVoice();

        Duck duck = new Duck(2);
        duck.getVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

    }
}

