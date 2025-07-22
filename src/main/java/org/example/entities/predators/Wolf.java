package org.example.entities.predators;


import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.util.AnimalsInfo;

import java.util.*;

public class Wolf extends Predator {

    public Wolf() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Horse", new DietEntry(10, AnimalsInfo.animalWeight.get("Horse")));
        diet.put("Deer", new DietEntry(15, AnimalsInfo.animalWeight.get("Deer")));
        diet.put("Rabbit", new DietEntry(60, AnimalsInfo.animalWeight.get("Rabbit")));
        diet.put("Mouse", new DietEntry(80, AnimalsInfo.animalWeight.get("Mouse")));
        diet.put("Goat", new DietEntry(60, AnimalsInfo.animalWeight.get("Goat")));
        diet.put("Sheep", new DietEntry(70, AnimalsInfo.animalWeight.get("Sheep")));
        diet.put("Boar", new DietEntry(60, AnimalsInfo.animalWeight.get("Boar")));
        diet.put("Buffalo", new DietEntry(10, AnimalsInfo.animalWeight.get("Buffalo")));
        diet.put("Duck", new DietEntry(40, AnimalsInfo.animalWeight.get("Duck")));

        super(6, "Wolf", AnimalsInfo.animalWeight.get("Wolf"), 30, 3, 8, "\uD83D\uDC3A", diet);
    }

    @Override
    public void reproduce() {

    }
}
