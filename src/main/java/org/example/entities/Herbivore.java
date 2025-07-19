package org.example.entities;

public abstract class Herbivore extends Animal {

    public Herbivore(int id, String name, double weight, int maxCount, int speed, double foodNeeded, String symbol) {
        super(id, name, weight, maxCount, speed, foodNeeded, symbol);
    }
}
