package org.example.entities;

import java.util.Map;
import java.util.Random;

public abstract class Predator extends Animal {
    public Predator(int id, String name, double weight, int maxCount, int speed, double foodNeeded, String symbol, Map<String, DietEntry> diet) {
        super(id, name, weight, maxCount, speed, foodNeeded, symbol, diet);
    }
}
