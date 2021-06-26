package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile{
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        setWeight(0.0);
    }
}
