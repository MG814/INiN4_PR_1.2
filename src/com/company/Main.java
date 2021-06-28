package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal animal1 = new Pet("dog");
        FarmAnimal animal2 = new FarmAnimal("cow");

        animal1.feed();
        animal1.takeForAWalk();
        animal1.feed();

        Human me = new Human("Michał", "Gotner", 26, 35000.0);
        Car car1 = new Disel("KIA", "Sportage", 2016, "red", 90000.0);
        Car fiat = new LPG("Fiat", "Uno", 1998, "blue", 5000.0);
        Car nissan = new Electric("Nissan", "Leaf", 2018, "silver", 165000.0);
        Phone mobilePhone = new Phone("SAMSUNG", "Galexy A5", 2015,2000.0);

        me.setSalary(90000.0);
        me.getSalary();

        me.setMyCar(car1,0);

        car1.turnOn();
        mobilePhone.turnOn();

        Human seller = new Human("Andrzej", "Kot", 57, 100000.0);
        Human buyer = new Human("Magda", "Nowak", 38, 300000.0);

        seller.setSalary(100000.0);
        buyer.setSalary(300000.0);
        seller.setMyCar(car1,0);
        System.out.println(seller.getMyCar(0));
        car1.sell(seller, buyer, 90000.0);
        System.out.println(seller.getMyCar(0));
        System.out.println("Pieniadze kupującego: " + buyer.getCash() + "\nPieniądze sprzedającego: " + seller.getCash());

        animal1.feed();
        animal2.feed(30.0);
        animal2.beEaten();
        animal2.feed();

        car1.refuel();
        fiat.refuel();
        nissan.refuel();

        buyer.valueGarage();

        Car[] cars = new Car[4];
        cars[0] = new Disel("Kia","Soul",2011,"silver",22000.0);
        cars[1] = new Electric("Nissan","Leaf",2021,"green",22000.0);
        cars[2] = new LPG("Fiat","Uno",1991,"red",22000.0);

        System.out.println(Arrays.deepToString(cars));
        Arrays.sort(cars, new CarYearComparator());
        System.out.println(Arrays.deepToString(cars));
    }
}
