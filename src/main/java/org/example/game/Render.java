package org.example.game;

import org.example.entities.Island;
import org.example.entities.Location;
import org.example.entities.Plant;

public class Render {
    private final Island island;

    public Render(Island island) {
        this.island = island;
    }

    public String render() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                Location location = island.getLocation(x,y);
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
