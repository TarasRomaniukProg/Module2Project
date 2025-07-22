package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;
import org.example.util.AnimalsInfo;

import java.util.*;

public class Sheep extends Herbivore {
    public Sheep() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        super(4, "Sheep", AnimalsInfo.animalWeight.get("Sheep"), 140, 3, 15, "\uD83D\uDC11", diet);
    }

    @Override
    public void reproduce() {

    }
}
