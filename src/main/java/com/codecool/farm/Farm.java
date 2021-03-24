package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private final List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public boolean isEmpty() {
        return animals == null || animals.isEmpty();
    }

    public void butcher(Butcher butcher) {
        for (int index = 0; index < animals.size(); index++ ) {
            if (butcher.canButcher(animals.get(index))) {
                animals.remove(index);
            }
        }
    }

    public List<String> getStatus() {
        List<String> animalStatus = new ArrayList<>();
        for (Animal animal : animals) {
            String textElement = "There is a " + animal.getSize() + " sized "
                    + animal.getClass().getSimpleName().toLowerCase() + " in the farm.";
            animalStatus.add(textElement);
        }
        return animalStatus;
    }

}

