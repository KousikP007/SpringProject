package org.example;

public class Alien {
    private int age;
    private Computer com;
    public Alien(){
        System.out.println("in alien object");
    }

    /*public Alien(Laptop lap, int age) {
        System.out.println("in constructor");
        this.lap = lap;
        this.age = age;
    }*/

    public void coding(){
        System.out.println("coding....");
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
}
