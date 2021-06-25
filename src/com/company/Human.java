package com.company;

import java.util.Date;

public class Human {
    public Animal pet;
    public Car myCar;
    private Double salary;

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
}
