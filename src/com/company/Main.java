package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Pet("dog");
        FarmAnimal animal2 = new FarmAnimal("cow");

        animal1.feed();
        animal1.takeForAWalk();
        animal1.feed();

        Human me = new Human("Michał", "Gotner", 26, 35000.0);
        Car car1 = new Disel("KIA", "Sportage", 2016, "red", 89500.0);
        Car fiat = new LPG("Fiat", "Uno", 1998, "blue", 5000.0);
        Car nissan = new Electric("Nissan", "Leaf", 2018, "silver", 165000.0);
        Phone mobilePhone = new Phone("SAMSUNG", "Galexy A5", 2015);

        me.setSalary(90000.0);
        me.getSalary();

        me.setMyCar(car1);

        car1.turnOn();
        mobilePhone.turnOn();

        Human seller = new Human("Andrzej", "Kot", 57, 100000.0);
        Human buyer = new Human("Magda", "Nowak", 38, 300000.0);

        seller.setSalary(100000.0);
        buyer.setSalary(300000.0);
        seller.setMyCar(car1);
        System.out.println(seller.getMyCar());
        car1.sell(seller, buyer, 90000.0);
        System.out.println(seller.getMyCar());
        System.out.println("Pieniadze kupującego: " + buyer.getCash() + "\nPieniądze sprzedającego: " + seller.getCash());

        animal1.feed();
        animal2.feed(30.0);
        animal2.beEaten();
        animal2.feed();

        car1.refuel();
        fiat.refuel();
        nissan.refuel();
    }
}
