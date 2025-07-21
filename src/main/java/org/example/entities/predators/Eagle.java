package org.example.entities.predators;


import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.entities.herbiores.Duck;
import org.example.entities.herbiores.Mouse;
import org.example.entities.herbiores.Rabbit;

import java.util.HashMap;
import java.util.Map;

public class Eagle extends Predator {
    public Eagle() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Fox", new DietEntry(10, Fox.getWeight()));
        diet.put("Rabbit", new DietEntry(90, Rabbit.getWeight()));
        diet.put("Mouse", new DietEntry(90, Mouse.getWeight()));
        diet.put("Duck", new DietEntry(80, Duck.getWeight()));

        super(9, "Eagle", 6, 20, 3, 1, "\uD83E\uDD85",diet);


    }

    @Override
    public void reproduce() {

    }



}
