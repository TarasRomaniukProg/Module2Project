package org.example.entities.predators;


import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.util.AnimalsInfo;

import java.util.HashMap;
import java.util.Map;

public class Fox extends Predator {

    public Fox() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Caterpillar", new DietEntry(40, AnimalsInfo.animalWeight.get("Caterpillar")));
        diet.put("Rabbit", new DietEntry(70, AnimalsInfo.animalWeight.get("Rabbit")));
        diet.put("Mouse", new DietEntry(90, AnimalsInfo.animalWeight.get("Mouse")));
        diet.put("Duck", new DietEntry(60, AnimalsInfo.animalWeight.get("Duck")));


        super(8, "Fox", AnimalsInfo.animalWeight.get("Fox"), 30, 2, 3, "\uD83E\uDD8A", diet);


    }

    @Override
    public void reproduce() {

    }


}
