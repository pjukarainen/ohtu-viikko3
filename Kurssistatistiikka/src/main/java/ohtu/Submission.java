package ohtu;

import java.util.Arrays;

public class Submission {
    private int week;
    private int hours;
    private int[] exercises;

    public void setWeek(int week) {
        this.week = week;
    }

    public int getWeek() {
        return week;
    }

    @Override
    public String toString() {
        return "viikko " + this.week + ": " + "tehtyjä tehtäviä yhteensä: " + this.exercises.length + ", aikaa kului yhteensä " + this.hours + " tuntia" + ", tehdyt tehtävät: " + Arrays.toString(this.exercises);
    }

    public int getHours() {
        return hours;
    }

    public int[] getExercises() {
        return exercises;
    }

    

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setExercises(int[] exercises) {
        this.exercises = exercises;
    }
    
}