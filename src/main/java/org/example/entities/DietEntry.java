package org.example.entities;

public class DietEntry {
    private int probability;
    private double weight;

    public DietEntry(int probability, double weight) {
        this.probability = probability;
        this.weight = weight;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
