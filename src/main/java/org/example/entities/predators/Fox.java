package org.example.entities.predators;


import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.entities.herbiores.Caterpillar;
import org.example.entities.herbiores.Duck;
import org.example.entities.herbiores.Mouse;
import org.example.entities.herbiores.Rabbit;

import java.util.HashMap;
import java.util.Map;

public class Fox extends Predator {

    public Fox() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Caterpillar", new DietEntry(40, Caterpillar.getWeight()));
        diet.put("Rabbit", new DietEntry(70, Rabbit.getWeight()));
        diet.put("Mouse", new DietEntry(90, Mouse.getWeight()));
        diet.put("Duck", new DietEntry(60, Duck.getWeight()));


        super(8, "Fox", 8, 30, 2, 3, "\uD83E\uDD8A", diet);


    }

    @Override
    public void reproduce() {

    }


}
