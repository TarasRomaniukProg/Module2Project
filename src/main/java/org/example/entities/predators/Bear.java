package org.example.entities.predators;


import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.entities.herbiores.*;

import java.util.HashMap;
import java.util.Map;

public class Bear extends Predator {


    public Bear() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Horse", new DietEntry(40, Horse.getWeight()));
        diet.put("Boa", new DietEntry(80, Boa.getWeight()));
        diet.put("Rabbit", new DietEntry(80, Rabbit.getWeight()));
        diet.put("Deer", new DietEntry(80, Deer.getWeight()));
        diet.put("Duck", new DietEntry(60, Duck.getWeight()));
        diet.put("Goat", new DietEntry(70, Goat.getWeight()));
        diet.put("Mouse", new DietEntry(90, Mouse.getWeight()));
        diet.put("Boar", new DietEntry(50, Boar.getWeight()));
        diet.put("Buffalo", new DietEntry(20, Buffalo.getWeight()));
        diet.put("Sheep", new DietEntry(70, Sheep.getWeight()));

        super(0, "Bear", 500, 5, 2, 80, "\uD83D\uDC3B",diet);
    }

    @Override
    public void reproduce() {

    }

}
