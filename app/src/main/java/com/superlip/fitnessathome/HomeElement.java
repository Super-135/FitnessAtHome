package com.superlip.fitnessathome;

public class HomeElement {

    private String nameElement;
    private int min;
    private int max;
    private int currentValue;
    private int weight;

    public HomeElement(String nameElement, int min, int max, int currentValue, int weight) {
        this.nameElement = nameElement;
        this.min = min;
        this.max = max;
        this.currentValue = currentValue;
        this.weight = weight;
    }

    public String getNameElement() {
        return nameElement;
    }

    public void setNameElement(String nameElement) {
        this.nameElement = nameElement;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
