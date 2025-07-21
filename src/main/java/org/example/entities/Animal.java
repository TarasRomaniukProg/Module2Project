package org.example.entities;


import java.util.Map;
import java.util.Objects;
import java.util.Random;

public abstract class Animal {
    private int id;
    private String name;
    private static double weight;
    private int maxCount;
    private int speed;
    private double foodNeeded;
    private String symbol;
    private Map<String, DietEntry> diet;
    private double eatenAmount;


    public Animal(int id, String name, double weight, int maxCount, int speed, double foodNeeded, String symbol, Map<String, DietEntry> diet) {
        this.id = id;
        this.name = name;
        Animal.weight = weight;
        this.maxCount = maxCount;
        this.speed = speed;
        this.foodNeeded = foodNeeded;
        this.symbol = symbol;
        this.diet = diet;
        this.eatenAmount = 0;
    }


    public void move(int x, int y) {
        Random random = new Random();

        int way = random.nextInt(1, 4);
        int side = random.nextInt(1, 2);
        int step = 0;
        if (this.getSpeed() > 1) {
            step = random.nextInt(1, this.getSpeed());
        } else if (this.getSpeed() == 1) {
            step = random.nextInt(0, this.getSpeed());
        }

        System.out.printf("Way: %d, Side: %d, Step: %d\n", way, side, step);
        switch (way) {
            case 1 -> {
                if (side == 1) {
                    if (y - step >= 0) {
                        int finalY = y - step;
                        if (Island.getLocation(x, finalY) == null) {
                            Island.setLocation(new Location(), x, finalY);
                        }
                        Location finalLocation = Island.getLocation(x, finalY);
                        moveLocation(finalLocation, x, y);
                    }

                }
                if (side == 2) {
                    if (y + step < Island.getHeight()) {
                        int finalY = y + step;
                        if (Island.getLocation(x, finalY) == null) {
                            Island.setLocation(new Location(), x, finalY);
                        }
                        Location finalLocation = Island.getLocation(x, y + step);
                        moveLocation(finalLocation, x, y);
                    }
                }
            }
            case 2 -> {
                if (side == 1) {
                    if (x - step >= 0) {
                        int finalX = x - step;
                        if (Island.getLocation(finalX, y) == null) {
                            Island.setLocation(new Location(), finalX, y);
                        }
                        Location finalLocation = Island.getLocation(finalX, y);
                        moveLocation(finalLocation, x, y);
                    }
                }
                if (side == 2) {
                    if (x + step < Island.getWidth()) {
                        int finalX = x + step;
                        if (Island.getLocation(finalX, y) == null) {
                            Island.setLocation(new Location(), finalX, y);
                        }
                        Location finalLocation = Island.getLocation(x + step, y);
                        moveLocation(finalLocation, x, y);
                    }
                }
            }
            case 3 -> {
                if (side == 1) {
                    if (x - step >= 0 && y - step >= 0) {
                        int finalX = x - step;
                        int finalY = y - step;
                        if (Island.getLocation(finalX, finalY) == null) {
                            Island.setLocation(new Location(), finalX, finalY);
                        }
                        Location finalLocation = Island.getLocation(x - step, y - step);
                        moveLocation(finalLocation, x, y);
                    }
                }
                if (side == 2) {
                    if (x + step < Island.getWidth() && y + step < Island.getHeight()) {
                        int finalX = x + step;
                        int finalY = x + step;
                        if (Island.getLocation(finalX, finalY) == null) {
                            Island.setLocation(new Location(), finalX, finalY);
                        }
                        Location finalLocation = Island.getLocation(x + step, y + step);
                        moveLocation(finalLocation, x, y);
                    }
                }
            }
            case 4 -> {
                if (side == 1) {
                    if (x + step < Island.getWidth() && y - step >= 0) {
                        int finalX = x + step;
                        int finalY = y - step;
                        if (Island.getLocation(finalX, finalY) == null) {
                            Island.setLocation(new Location(), finalX, finalY);
                        }
                        Location finalLocation = Island.getLocation(x + step, y - step);
                        moveLocation(finalLocation, x, y);
                    }
                }
                if (side == 2) {
                    if (x - step >= 0 && y + step < Island.getHeight()) {
                        int finalX = x - step;
                        int finalY = y + step;
                        if (Island.getLocation(finalX, finalY) == null) {
                            Island.setLocation(new Location(), finalX, finalY);
                        }
                        Location finalLocation = Island.getLocation(x - step, y + step);
                        moveLocation(finalLocation, x, y);
                    }
                }
            }
        }
    }

    public void moveLocation(Location finalLocation, int x, int y) {
        Location location = Island.getLocation(x, y);
        for (Animal animal : finalLocation.getAnimals()) {
            boolean isEdible = eat(animal.getName());
            if (isEdible) {
                finalLocation.getAnimals().remove(animal);
            }
        }
        if (this.getClass().toString().contains("herbivores")) {
            for (Plant plant : location.getPlants()) {
                boolean isEdible = eat("Plant");
                if (isEdible) {
                    finalLocation.getPlants().remove(plant);
                }
            }
        }
        location.getAnimals().remove(this);
        finalLocation.addAnimal(this);

    }

    public boolean eat(String name) {
        Random random = new Random();
        for (Map.Entry<String, DietEntry> entry : diet.entrySet()) {
            DietEntry dietEntry = entry.getValue();
            if (dietEntry.getWeight() + eatenAmount <= foodNeeded && random.nextInt(100) < dietEntry.getProbability()) {
                return true;
            }
        }
        return false;
    }

    public abstract void reproduce();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        Animal.weight = weight;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFoodNeeded() {
        return foodNeeded;
    }

    public void setFoodNeeded(double foodNeeded) {
        this.foodNeeded = foodNeeded;
    }

    public String getSymbol() {
        return symbol;
    }

    public Map<String, DietEntry> getDiet() {
        return diet;
    }

    public double getEatenAmount() {
        return eatenAmount;
    }

    public void setEatenAmount(double eatenAmount) {
        this.eatenAmount = eatenAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && maxCount == animal.maxCount && speed == animal.speed && Double.compare(foodNeeded, animal.foodNeeded) == 0 && Double.compare(eatenAmount, animal.eatenAmount) == 0 && Objects.equals(name, animal.name) && Objects.equals(diet, animal.diet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, maxCount, speed, foodNeeded, diet, eatenAmount);
    }
}

