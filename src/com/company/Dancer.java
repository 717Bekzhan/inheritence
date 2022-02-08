package com.company;

public class Dancer extends Person{
    String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void learn() {
        System.out.println();
    }public void walk(){
        System.out.println();
    }public void eat(){
        System.out.println();
}   public void dancing(){
        System.out.println(name + "danced greatly ");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
