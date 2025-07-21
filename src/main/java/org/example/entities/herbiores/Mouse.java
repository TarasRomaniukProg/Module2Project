package org.example.entities.herbiores;


import org.example.entities.DietEntry;
import org.example.entities.Herbivore;
import org.example.entities.Plant;

import java.util.HashMap;
import java.util.Map;

public class Mouse extends Herbivore {
    public Mouse() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Plant", new DietEntry(100, Plant.WEIGHT));
        diet.put("Caterpillar", new DietEntry(90, Caterpillar.getWeight()));
        super(12, "Mouse", 0.05, 500, 1, 0.01, "\uD83D\uDC01",diet);

    }


    @Override
    public void reproduce() {

    }

}
