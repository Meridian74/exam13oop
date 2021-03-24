package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals;

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
        if (animals == null || animals.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void butcher(Butcher butcher) {
        for (Animal animal : animals) {
            if (butcher.canButcher(animal)) {
                animals.remove(animal);
            }
        }
    }

    public List<String> getStatus() {
        List<String> animalStatus = new ArrayList<>();
        for (Animal animal : animals) {
            String textElement = "There is a " + animal.getSize() + " sized "
                    + animal.getClass().getSimpleName().toLowerCase() + " in the farm.";
            animalStatus.add(textElement);
            System.out.println(textElement);
        }
        return animalStatus;
    }

}

