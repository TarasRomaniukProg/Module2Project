package org.example.entities.predators;

import org.example.entities.DietEntry;
import org.example.entities.Predator;
import org.example.entities.herbiores.Duck;
import org.example.entities.herbiores.Mouse;
import org.example.entities.herbiores.Rabbit;

import java.util.HashMap;
import java.util.Map;

public class Boa extends Predator {

    public Boa() {
        Map<String, DietEntry> diet = new HashMap<>();
        diet.put("Fox", new DietEntry(15, Fox.getWeight()));
        diet.put("Rabbit", new DietEntry(20, Rabbit.getWeight()));
        diet.put("Mouse", new DietEntry(40, Mouse.getWeight()));
        diet.put("Duck", new DietEntry(10, Duck.getWeight()));

        super(7, "Boa", 15, 30, 1, 3, "\uD83D\uDC0D", diet);


    }

    @Override
    public void reproduce() {

    }


}
