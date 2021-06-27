package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {
    private Animal pet;
    private Car myCar;
    private Phone myPhone;
    private Double salary;
    private String name;
    private String lastname;
    private int age;
    private Double cash = 0.0;

    public Human(String name,String lastname, int age, Double cash){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.cash = cash;
    }

    public Phone getMyPhone(){
        return this.myPhone;
    }

    public void setMyPhone(Phone myPhone){
        this.myPhone = myPhone;
    }

    public Animal getPet(){
        return this.pet;
    }

    public void setPet(Animal pet){
        this.pet = pet;
    }

    public Double getCash(){
        return this.cash;
    }

    public void setCash(Double cash){
        this.cash = cash;
    }

    public Double getSalary() {
        System.out.println("Informację pobrano: " + new Date());
        System.out.println("Wynagrodzenie wynosi: " + this.salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("\nDane wysłane do systemu księgowego.");
            System.out.println("Proszę odebrać aneks do umowy u Pani Hani z kadr.");
            System.out.println("Informacje o zmianie wynagrodzenia zostały przekazane do ZUS i US.\n");
            this.salary = salary;
        } else
            System.out.println("Wartośc nieprawisłowa.");
    }

    public Car getMyCar() {
            return this.myCar;
    }

    public void setMyCar(Car myCar) {
        if(salary > myCar.getValue()){
            System.out.println("Kupiłeś samochód za gotówkę.");
            this.myCar = myCar;
        }
        else if(salary > 1/12.0 * myCar.getValue()){
            System.out.println("Kupiono samochód na kredyt.");
            this.myCar = myCar;
        }
        else
            System.out.println("Nie stać Cię na samochód.");
    }

    @Override
    public String toString() {
        return "name: " + name + " lastname: " + lastname + " age: " + age;
    }


    public void removeCar() {
        this.myCar = null;
    }

    public void removePet() {
        this.pet = null;
    }

    public void removePhone() {
        this.myPhone = null;
    }
}
