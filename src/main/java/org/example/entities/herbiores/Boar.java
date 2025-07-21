package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Plant;
import org.example.entities.Predator;

import java.util.HashMap;
import java.util.Map;

public class Boar extends Predator {
    public Boar() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        diet.put("Caterpillar", new DietEntry(90, Caterpillar.getWeight()));
        super(3, "Boar", 400, 50, 2, 50, "\uD83D\uDC17",diet);
    }


    @Override
    public void reproduce() {

    }

}
