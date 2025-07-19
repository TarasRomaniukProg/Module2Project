package org.example.game;

import org.example.entities.Animal;
import org.example.entities.Island;
import org.example.entities.Location;
import org.example.util.Symbols;

import java.util.Random;

public class Runner {
    public static void run () {
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
}
