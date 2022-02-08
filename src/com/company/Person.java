package com.company;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println("Bekzhan learning coding every day");
    }public void walk(){
        System.out.println("For Bekzhan walk evening very useful");
    }public void eat(){
        System.out.println("Bekzhan dont eat fast foods");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
