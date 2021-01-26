package com.superlip.fitnessathome.AllWorkout;

import java.util.ArrayList;

public class Day {
    private int day;
    private ArrayList<Integer> countRepetitions;
    private int numberHours;
    private int state;

    public Day(int day, ArrayList<Integer> countRepetitions, int numberHours, int state) {
        this.day = day;
        this.countRepetitions = countRepetitions;
        this.numberHours = numberHours;
        this.state = state;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public ArrayList<Integer> getCountRepetitions() {
        return countRepetitions;
    }

    public void setCountRepetitions(ArrayList<Integer> countRepetitions) {
        this.countRepetitions = countRepetitions;
    }

    public int getNumberHours() {
        return numberHours;
    }

    public void setNumberHours(int numberHours) {
        this.numberHours = numberHours;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
