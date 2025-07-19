package org.example.entities;

import java.util.*;

public class Location {
    private final List<Animal> animals = new ArrayList<>();
    private final List<Plant> plants = new ArrayList<>();

    public synchronized void addAnimal(Animal animal) {
        Random random =  new Random();
        int number = random.nextInt(1,animal.getMaxCount());
        org.example.statistics.Storage.allAnimals.put(animal,number);
        animals.add(animal);
    }

    public synchronized void growPlants() {

    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }
}