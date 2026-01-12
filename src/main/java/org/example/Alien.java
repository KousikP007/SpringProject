package org.example;

public class Alien {
    private int age;
    private Laptop lap;
    public Alien(){
        System.out.println("in alien object");
    }

    public Alien(Laptop lap, int age) {
        System.out.println("in constructor");
        this.lap = lap;
        this.age = age;
    }

    public void coding(){
        System.out.println("coding....");
        lap.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
