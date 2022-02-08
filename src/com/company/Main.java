package com.company;

public class Main {

    public static void main(String[] args) {
    Person person = new Person("Bekzhan", "Read");
        System.out.println(person);
    person.learn();
    person.walk();
    person.eat();

        System.out.println("          ");

     Programmer programmer = new Programmer("Beks", "Keep a cod","Google");
        System.out.println(programmer);
        programmer.coding();

        System.out.println("       ");

        Dancer dancer = new Dancer("Aidana", "Dancing", "BTL");
        dancer.dancing();
        System.out.println(dancer);

        System.out.println("       ");
        Singer singer = new Singer("Billie Eilish", "Sing songs", "717abq");
        System.out.println(singer);
        singer.playGuitar();
    }
}
