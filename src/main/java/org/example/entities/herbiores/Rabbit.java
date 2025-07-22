package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;
import org.example.util.AnimalsInfo;

import java.util.HashMap;
import java.util.Map;

public class Rabbit extends Herbivore {

    public Rabbit() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100,Plant.WEIGHT));
        super(10, "Rabbit", AnimalsInfo.animalWeight.get("Rabbit"), 150, 2, 0.45, "\uD83D\uDC07", diet);
    }



    @Override
    public void reproduce() {

    }

}
