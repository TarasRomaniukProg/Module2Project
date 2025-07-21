package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;

import java.util.HashMap;
import java.util.Map;

public class Buffalo extends Herbivore {
    public Buffalo() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        super(1, "Buffalo", 700, 10, 3, 100, "\uD83D\uDC03",diet);
    }


    @Override
    public void reproduce() {

    }


}
