package org.example.game;

import org.example.entities.Island;
import org.example.entities.Location;
import org.example.entities.Plant;

public class Render {
    public static String render() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < Island.getHeight(); y++) {
            for (int x = 0; x < Island.getWidth(); x++) {
                Location location = Island.getLocation(x,y);
                if (location != null) {
                    if(location.getAnimals() != null) {
                        for (int i = 0; i < location.getAnimals().size(); i++) {
                            sb.append(location.getAnimals().get(i).getSymbol());
                        }
                    } else {
                        sb.append(" ");
                    }
                    sb.append(Plant.SYMBOL.repeat(location.getPlants().size()));
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
