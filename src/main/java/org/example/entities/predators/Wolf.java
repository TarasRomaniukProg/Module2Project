package org.example.entities.predators;


import org.example.entities.Animal;
import org.example.entities.Island;
import org.example.entities.Location;
import org.example.entities.Predator;

import java.util.Random;

public class Wolf extends Predator {
    public Wolf() {
        super(6, "Wolf", 50, 30, 3, 8, "\uD83D\uDC3A");
    }

    @Override
    public void move(int x, int y) {
        Random random = new Random();

        int way = random.nextInt(1, 4);
        int side = random.nextInt(1, 2);
        int step = random.nextInt(1, super.getSpeed());

        switch (way) {
            case 1 -> {
                if (side == 1) {
                    if (y - step >= 0) {
                        int finalY = y - step;
                        if(Island.getLocation(x,finalY) == null){
                            Island.setLocation(new Location(), x, finalY);
                        }
                        Location finalLocation = Island.getLocation(x, finalY);
                        moveLocation(finalLocation,random,x,y,x, y - step);
                    }

                }
                if (side == 2) {
                    if (y + step < Island.getHeight()) {
                        int finalY = y + step;
                        if(Island.getLocation(x,finalY) == null){
                            Island.setLocation(new Location(), x, finalY);
                        }
                        Location finalLocation = Island.getLocation(x, y + step);
                        moveLocation(finalLocation,random,x,y,x, y + step);
                    }
                }
            }
            case 2 -> {
                if(side == 1){
                    if(x - step >= 0){
                        int finalX = x - step;
                        if(Island.getLocation(finalX, y) == null) {
                            Island.setLocation(new Location(), finalX, y);
                        }
                        Location finalLocation = Island.getLocation(finalX, y);
                        moveLocation(finalLocation,random,x,y,x - step, y);
                    }
                }
                if(side == 2){
                    if(x + step < Island.getWidth()){
                        int finalX = x + step;
                        if(Island.getLocation(finalX, y) == null) {
                            Island.setLocation(new Location(), finalX, y);
                        }
                        Location finalLocation = Island.getLocation(x + step, y);
                        moveLocation(finalLocation,random,x,y,x + step, y);
                    }
                }
            }
            case 3 -> {
                if(side == 1){
                    if(x - step >= 0 && y - step >= 0){
                        int finalX = x - step;
                        int finalY = y - step;
                        if(Island.getLocation(finalX,finalY) == null){
                            Island.setLocation(new Location(), finalX, finalY);
                        }
                        Location finalLocation = Island.getLocation(x - step, y - step);
                        moveLocation(finalLocation,random,x,y,x - step, y - step);
                    }
                }
                if(side == 2){
                    if(x + step < Island.getWidth() && y + step < Island.getHeight()){
                        int finalX = x + step;
                        int finalY = x + step;
                        if(Island.getLocation(finalX, finalY) == null) {
                            Island.setLocation(new Location(), finalX, finalY);
                        }
                        Location finalLocation = Island.getLocation(x + step, y + step);
                        moveLocation(finalLocation,random,x,y,x + step, y + step);
                    }
                }
            }
            case 4 ->{
                if(side == 1){
                    if(x + step < Island.getWidth() && y - step >= 0){
                        int finalX = x + step;
                        int finalY = y - step;
                        if(Island.getLocation(finalX,finalY) == null){
                            Island.setLocation(new Location(), finalX, finalY);
                        }
                        Location finalLocation = Island.getLocation(x + step, y - step);
                        moveLocation(finalLocation,random,x,y,x + step, y - step);
                    }
                }
                if(side == 2){
                    if(x - step >= 0 && y + step < Island.getHeight()){
                        int finalX = x - step;
                        int finalY = y + step;
                        if(Island.getLocation(finalX, finalY) == null) {
                            Island.setLocation(new Location(), finalX, finalY);
                        }
                        Location finalLocation = Island.getLocation(x - step, y + step);
                        moveLocation(finalLocation,random,x,y,x - step, y + step);
                    }
                }
            }
        }
    }

    public void moveLocation(Location finalLocation,Random random,int x, int y, int finalX, int finalY){
        Location location = Island.getLocation(x,y);
        int eatenAmount = 0;
        for(Animal animal : finalLocation.getAnimals()){
            int probability = random.nextInt(100);
            boolean isEdible = checkTarget(animal, probability, eatenAmount);
            if (isEdible){
                finalLocation.getAnimals().remove(animal);
            }
        }
        location.getAnimals().remove(this);
        finalLocation.addAnimal(this);

    }


    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    private boolean checkTarget(Animal animal, int probability, int eatenAmount) {
        if (animal.getClass().toString().contains("Horse") && probability < 10 && eatenAmount < animal.getWeight()) {
            return true;
        } else if (animal.getClass().toString().contains("Deer") && probability < 15 && eatenAmount < animal.getWeight()) {
            return true;
        } else if (animal.getClass().toString().contains("Rabbit") && probability < 60 && eatenAmount < animal.getWeight()) {
            return true;
        } else if (animal.getClass().toString().contains("Mouse") && probability < 80 && eatenAmount < animal.getWeight()) {
            return true;
        } else if (animal.getClass().toString().contains("Goat") && probability < 60 && eatenAmount < animal.getWeight()) {
            return true;
        } else if (animal.getClass().toString().contains("Sheep") && probability < 70 && eatenAmount < animal.getWeight()) {
            return true;
        } else if (animal.getClass().toString().contains("Boar") && probability < 15 && eatenAmount < animal.getWeight()) {
            return true;
        } else if (animal.getClass().toString().contains("Buffalo") && probability < 10 && eatenAmount < animal.getWeight()) {
            return true;
        } else return animal.getClass().toString().contains("Duck") && probability < 40 && eatenAmount < animal.getWeight();
    }
}
