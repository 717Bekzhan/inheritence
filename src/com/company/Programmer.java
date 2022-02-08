package com.company;

public class Programmer extends Person {

    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer(String name, String designation) {
        super(name, designation);
    }
    public void learn() {
        System.out.println("Programmer got to learn always a new knowledges");
    }public void walk(){
        System.out.println("Programmer got to walk every day");
    }public void eat() {
        System.out.println("Programmer eating");
    }public void coding (){
        System.out.println(" Programmer got to short keep coding  ");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
