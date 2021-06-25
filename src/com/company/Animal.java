package com.company;

public class Animal {
    public final String species;
    private Double weight;
    private final Double DEFAULT_WEIGHT = 1.0;

    public Animal(String species){
        this.species = species;
        switch (species){
            case "cow":
                this.weight = 500.0;
                break;
            case "dog":
                this.weight = 40.0;
                break;
            case "cat":
                this.weight = 5.0;
                break;
            default:
               this.weight = DEFAULT_WEIGHT;
               break;
        }
    }

    public void feed(){
        if(weight > 0.0){
            weight+=1;
            System.out.println(species + " " + weight + " kg");
        }
        else
            System.out.println("Zwierzę nie żyje.");
    }

    public void takeForAWalk(){
        if(weight > 0.0){
            weight-=1;
            System.out.println(species + " " + weight + " kg");
        }
        else
            System.out.println("Zwierzę nie żyje.");
    }


}
