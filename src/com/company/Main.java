package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("dog");

        animal1.feed();
        animal1.takeForAWalk();
        animal1.feed();

        Human me = new Human("Michał","Gotner",26);
        Car car1 = new Car("KIA","Sportage",2016,"red",89500.0);

        me.setSalary(90000.0);
        me.getSalary();

        me.setMyCar(car1);

    }
}
