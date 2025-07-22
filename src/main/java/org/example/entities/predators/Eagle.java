package org.example.entities.predators;


import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.util.AnimalsInfo;

import java.util.HashMap;
import java.util.Map;

public class Eagle extends Predator {
    public Eagle() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Fox", new DietEntry(10, AnimalsInfo.animalWeight.get("Fox")));
        diet.put("Rabbit", new DietEntry(90, AnimalsInfo.animalWeight.get("Rabbit")));
        diet.put("Mouse", new DietEntry(90, AnimalsInfo.animalWeight.get("Mouse")));
        diet.put("Duck", new DietEntry(80, AnimalsInfo.animalWeight.get("Duck")));

        super(9, "Eagle", AnimalsInfo.animalWeight.get("Eagle"), 20, 3, 1, "\uD83E\uDD85",diet);


    }

    @Override
    public void reproduce() {

    }



}
