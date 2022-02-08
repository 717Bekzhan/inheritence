package com.company;

public class Singer extends Person{
    String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    public void learn() {
        System.out.println();
    }public void walk(){
        System.out.println();
    }public void eat(){
        System.out.println();

}     public void playGuitar(){
        System.out.println(name + "can play the guitar");

    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
