package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {
    private Animal pet;
    private Car[] garage;
    private Phone myPhone;
    private Double salary;
    private String name;
    private String lastname;
    private int age;
    private Double cash = 0.0;
    private static final int Default_Garage_Size = 4;

    public Human(String name,String lastname, int age, Double cash){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.cash = cash;
        this.garage = new Car[Default_Garage_Size];
    }

    public Human(String name,String lastname, int age, Double cash, int garageSize){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.cash = cash;
        this.garage = new Car[garageSize];
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

    public Car getMyCar(int parkNumber) {
        return this.garage[parkNumber];
    }

    public void setMyCar(Car myCar, int parkNumber) {
        if(salary > myCar.getValue()){
            System.out.println("Kupiłeś samochód za gotówkę.");
            this.garage[parkNumber] = myCar;
        }
        else if(salary > 1/12.0 * myCar.getValue()){
            System.out.println("Kupiono samochód na kredyt.");
            this.garage[parkNumber] = myCar;
        }
        else
            System.out.println("Nie stać Cię na samochód.");
    }

    @Override
    public String toString() {
        return "name: " + name + " lastname: " + lastname + " age: " + age;
    }


    public void removeCar(Car car) {
        for(int i = 0; i < this.garage.length; i++){
            if(car == this.garage[i])
                this.garage[i] = null;
        }
    }

    public void removePet() {
        this.pet = null;
    }

    public void removePhone() {
        this.myPhone = null;
    }

    public boolean haveCar(Car car) {
        for(int i = 0; i < this.garage.length; i++){
            if(car == this.garage[i])
                return true;
        }
        return false;
    }

    public boolean haveFreeSpace() {
        for(int i = 0; i < this.garage.length; i++){
            if(this.garage[i] == null)
                return true;
        }
        return false;
    }

    public void addCar(Car car) {
        for(int i = 0; i < this.garage.length; i++){
            if(this.garage[i] == null){
                this.garage[i] = car;
                break;
            }

        }
    }

    public void valueGarage(){
        Double sum = 0.0;
        for(int i = 0; i < this.garage.length; i++){
            if(this.garage[i] != null){
                sum += this.garage[i].getValue();
            }
        }
        System.out.println("Suma wartości aut wynosi: "+sum);
    }
}
