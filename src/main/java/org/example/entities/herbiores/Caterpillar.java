package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;

import java.util.HashMap;
import java.util.Map;

public class Caterpillar extends Herbivore {
    public Caterpillar() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        super(13, "Caterpillar", 0.01, 1000, 0, 0, "\uD83D\uDC1B", diet);
    }


    @Override
    public void reproduce() {

    }

}