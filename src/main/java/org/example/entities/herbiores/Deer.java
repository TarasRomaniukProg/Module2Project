package org.example.entities.herbiores;

import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;

import java.util.HashMap;
import java.util.Map;

public class Deer extends Herbivore {
    public Deer() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        super(14, "Deer", 300, 20, 4, 50, "\uD83E\uDD8C",diet);
    }


    @Override
    public void reproduce() {

    }


}
