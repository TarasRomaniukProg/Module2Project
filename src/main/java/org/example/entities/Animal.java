package org.example.entities;


import java.util.Objects;

public abstract class Animal {
    private int id;
    private String name;
    private double weight;
    private int maxCount;
    private int speed;
    private double foodNeeded;
    private String symbol;


    public Animal(int id, String name, double weight, int maxCount, int speed, double foodNeeded, String symbol) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.maxCount = maxCount;
        this.speed = speed;
        this.foodNeeded = foodNeeded;
        this.symbol = symbol;
    }

    public abstract void move();
    public abstract void eat();
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Double.compare(weight, animal.weight) == 0 && maxCount == animal.maxCount && speed == animal.speed && Double.compare(foodNeeded, animal.foodNeeded) == 0 && Objects.equals(name, animal.name) && Objects.equals(symbol, animal.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight, maxCount, speed, foodNeeded, symbol);
    }
}

