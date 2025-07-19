package org.example.util;

import org.example.entities.Animal;
import org.example.entities.herbiores.*;
import org.example.entities.predators.*;

import java.util.HashMap;
import java.util.Map;

public class Symbols {

    public static final Map<Integer, Animal> entities = new HashMap<>(Map.ofEntries(
            Map.entry(0, new Bear()),
            Map.entry(1, new Buffalo()),
            Map.entry(2, new Horse()),
            Map.entry(3, new Boar()),
            Map.entry(4, new Sheep()),
            Map.entry(5, new Goat()),
            Map.entry(6, new Wolf()),
            Map.entry(7, new Boa()),
            Map.entry(8, new Fox()),
            Map.entry(9, new Eagle()),
            Map.entry(10, new Rabbit()),
            Map.entry(11, new Duck()),
            Map.entry(12, new Mouse()),
            Map.entry(13, new Caterpillar()),
            Map.entry(14, new Deer())
    )
    );

}