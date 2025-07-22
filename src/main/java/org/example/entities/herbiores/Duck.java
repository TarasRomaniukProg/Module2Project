package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;
import org.example.util.AnimalsInfo;

import java.util.HashMap;
import java.util.Map;

public class Duck extends Herbivore {
    public Duck() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        diet.put("Caterpillar", new DietEntry(90, AnimalsInfo.animalWeight.get("Caterpillar")));
        super(11, "Duck", AnimalsInfo.animalWeight.get("Duck"), 200, 4, 0.15, "\uD83E\uDD86", diet);
    }

    @Override
    public void reproduce() {

    }



}
