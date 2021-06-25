package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("dog");

        animal1.feed();
        animal1.takeForAWalk();
        animal1.feed();

        Human me = new Human();
        Car car1 = new Car("KIA","Sportage",2016,"red");

        me.myCar = car1;
    }
}
