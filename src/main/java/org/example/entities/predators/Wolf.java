package org.example.entities.predators;


import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.entities.herbiores.*;

import java.util.*;

public class Wolf extends Predator {

    public Wolf() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Horse", new DietEntry(10, Horse.getWeight()));
        diet.put("Deer", new DietEntry(15, Deer.getWeight()));
        diet.put("Rabbit", new DietEntry(60, Rabbit.getWeight()));
        diet.put("Mouse", new DietEntry(80, Mouse.getWeight()));
        diet.put("Goat", new DietEntry(60, Goat.getWeight()));
        diet.put("Sheep", new DietEntry(70, Sheep.getWeight()));
        diet.put("Boar", new DietEntry(60, Rabbit.getWeight()));
        diet.put("Buffalo", new DietEntry(10, Buffalo.getWeight()));
        diet.put("Duck", new DietEntry(40, Duck.getWeight()));

        super(6, "Wolf", 50, 30, 3, 8, "\uD83D\uDC3A", diet);
    }

    @Override
    public void reproduce() {

    }
}
