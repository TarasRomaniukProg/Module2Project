package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;
import org.example.util.AnimalsInfo;

import java.util.HashMap;
import java.util.Map;

public class Goat extends Herbivore {
    public Goat() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        super(5, "Goat", AnimalsInfo.animalWeight.get("Goat"), 140, 3, 10, "\uD83D\uDC10",diet);
    }


    @Override
    public void reproduce() {

    }

}
