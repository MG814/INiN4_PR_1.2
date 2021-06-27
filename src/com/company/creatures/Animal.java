package com.company.creatures;

import com.company.Human;
import com.company.Sellable;

public abstract class Animal implements Sellable, Feedable{
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

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void feed(){
        if(weight > 0.0){
            weight+=1;
            System.out.println(species + " " + weight + " kg");
        }
        else
            System.out.println("Zwierzę nie żyje.");
    }

    public void feed(Double foodWeight){
        if(weight > 0.0){
            weight+=foodWeight;
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

    @Override
    public String toString() {
        return "species: " + species  + " weight: " + weight + " kg" ;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPet() != null && buyer.getCash() >= price)
        {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.setPet(seller.getPet());
            seller.removePet();
            System.out.println("Kupujący nabył "+buyer.getPet().species+" za kwotę "+price+"zl.");
        }
        else
            System.out.println("Upewnij się czy sprzedający ma zwierzę lub czy kupujący ma wystarczająco pieniędzy.");
    }
}
