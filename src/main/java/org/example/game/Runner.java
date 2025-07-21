package org.example.game;

import org.example.entities.Animal;
import org.example.entities.Island;
import org.example.entities.Location;
import org.example.entities.herbiores.*;
import org.example.entities.predators.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Runner {
    private static final Map<Integer, Animal> entities = new HashMap<>(Map.ofEntries(
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
    public static void initialise () {
        for (Map.Entry<Integer, Animal> entity : entities.entrySet()) {
            Animal animal = entity.getValue();

            Random random = new Random();

            int x = random.nextInt(0, Island.getWidth() - 1);
            int y = random.nextInt(0, Island.getHeight() - 1);

            if (Island.getLocation(x, y) == null) {
                Location location = new Location();
                Island.setLocation(location, x, y);
            }
            Location location = Island.getLocation(x,y);
            location.addAnimal(animal);
        }
    }
    public static void run () throws InterruptedException {
        for (int y = 0; y < Island.getHeight(); y++) {
            for (int x = 0; x < Island.getWidth(); x++) {
                Location location = Island.getLocation(x,y);
                if (location != null && location.getAnimals() != null) {
                    for (int i = 0; i < location.getAnimals().size(); i++) {
                        Animal animal = location.getAnimals().get(i);
                        animal.move(x, y);
                        System.out.println("* " + animal.getName());
                        System.out.println(Render.render());
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
