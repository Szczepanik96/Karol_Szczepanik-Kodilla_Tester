package com.kodilla.Abstract.homework;

public class JobApplication {

    public static void main(String[] args) {

        Plumber plumber = new Plumber(1654.65, "Pushing holes");

        Policeman policeman = new Policeman(2525.12, "Punishment for offences");

        Fireman fireman = new Fireman(2356.12, "Pouring water");

        Nurse nurse = new Nurse(1949.33, "helping patients");

        Dancer dancer = new Dancer(768.02,"Destroying shoes");


        Person person = new Person("Janusz",53, plumber.responsibilities);

        Person person1 = new Person("Szymon", 42, fireman.responsibilities);

        Person person2 = new Person("Wawrzyn", 32, policeman.responsibilities);

        Person person3 = new Person("Jadźka", 23, nurse.responsibilities);
        
        Person person4 = new Person("Joahim", 47, dancer.responsibilities);


        System.out.println("Plumber responsibilities: " + plumber.responsibilities + " " + "Salary " + plumber.salary());

        System.out.println("Policeman responsibilities: " + policeman.responsibilities + " " + "Salary " + policeman.salary());

        System.out.println("Fireman responsibilities " + fireman.responsibilities + " " + "Salary " + fireman.salary());

        System.out.println("Nurse responsibilities" + nurse.responsibilities + " " + "Salary " + nurse.salary());

        System.out.println("Dance responsibilities" + dancer.responsibilities + " " + "Salary " + dancer.salary());


        System.out.println("Name: " + person.firstname + " Job: " + person.job);

        System.out.println("Name " + person1.firstname + " Job " + person1.job);

        System.out.println("Name " + person2.firstname + " Job " + person2.job);

        System.out.println("Name " + person3.firstname + " Job " + person3.job);

        System.out.println("Name " + person4.firstname + " Job " + person4.job);
    }
}