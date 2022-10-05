package org.example.tasksA.computer;

public class Processor extends Device {
    private int numberOgCores;
    private int frequency;
    private int cachMemory;
    private String socet;

    public Processor (String manufacturer, int numberOgCores) {
        this.manufacturer = manufacturer;
        this.numberOgCores = numberOgCores;
    }

    public int getNumberOgCores() {
        return numberOgCores;
    }

    public void setNumberOgCores(int numberOgCores) {
        this.numberOgCores = numberOgCores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCachMemory() {
        return cachMemory;
    }

    public void setCachMemory(int cachMemory) {
        this.cachMemory = cachMemory;
    }

    public String getSocet() {
        return socet;
    }

    public void setSocet(String socet) {
        this.socet = socet;
    }
}
