package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;
import org.example.util.AnimalsInfo;

import java.util.HashMap;
import java.util.Map;

public class Horse extends Herbivore {
    public Horse() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        super(2, "Horse", AnimalsInfo.animalWeight.get("Horse"), 20, 4, 60, "\uD83D\uDC0E", diet);
    }

    @Override
    public void reproduce() {

    }
}
