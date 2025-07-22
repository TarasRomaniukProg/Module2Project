package org.example.entities.predators;


import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.util.AnimalsInfo;

import java.util.HashMap;
import java.util.Map;

public class Bear extends Predator {


    public Bear() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Horse", new DietEntry(40, AnimalsInfo.animalWeight.get("Horse")));
        diet.put("Boa", new DietEntry(80, AnimalsInfo.animalWeight.get("Boa")));
        diet.put("Rabbit", new DietEntry(80, AnimalsInfo.animalWeight.get("Rabbit")));
        diet.put("Deer", new DietEntry(80, AnimalsInfo.animalWeight.get("Deer")));
        diet.put("Duck", new DietEntry(60, AnimalsInfo.animalWeight.get("Duck")));
        diet.put("Goat", new DietEntry(70, AnimalsInfo.animalWeight.get("Goat")));
        diet.put("Mouse", new DietEntry(90, AnimalsInfo.animalWeight.get("Mouse")));
        diet.put("Boar", new DietEntry(50, AnimalsInfo.animalWeight.get("Boar")));
        diet.put("Buffalo", new DietEntry(20, AnimalsInfo.animalWeight.get("Buffalo")));
        diet.put("Sheep", new DietEntry(70, AnimalsInfo.animalWeight.get("Sheep")));

        super(0, "Bear", AnimalsInfo.animalWeight.get("Bear"), 5, 2, 80, "\uD83D\uDC3B",diet);
    }

    @Override
    public void reproduce() {

    }

}
