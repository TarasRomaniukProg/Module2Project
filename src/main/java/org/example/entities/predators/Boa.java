package org.example.entities.predators;

import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.util.AnimalsInfo;

import java.util.HashMap;
import java.util.Map;

public class Boa extends Predator {

    public Boa() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Fox", new DietEntry(15, AnimalsInfo.animalWeight.get("Fox")));
        diet.put("Rabbit", new DietEntry(20, AnimalsInfo.animalWeight.get("Rabbit")));
        diet.put("Mouse", new DietEntry(40, AnimalsInfo.animalWeight.get("Mouse")));
        diet.put("Duck", new DietEntry(10, AnimalsInfo.animalWeight.get("Duck")));

        super(7, "Boa", AnimalsInfo.animalWeight.get("Boa"), 30, 1, 3, "\uD83D\uDC0D", diet);


    }

    @Override
    public void reproduce() {

    }


}
