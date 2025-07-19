package org.example.game;

import org.example.entities.Animal;
import org.example.entities.Island;
import org.example.entities.Location;
import org.example.util.Symbols;

import java.util.Random;

public class Runner {
    public static void initialise () {
        for (int i = 0; i < Symbols.entities.size(); i++) {
            Animal animal = Symbols.entities.get(i);

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
            System.out.println("#".repeat(20));
            for (int x = 0; x < Island.getWidth(); x++) {
                Location location = Island.getLocation(x,y);
                if (location != null && location.getAnimals() != null) {
                    for (Animal animal : location.getAnimals()) {
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
