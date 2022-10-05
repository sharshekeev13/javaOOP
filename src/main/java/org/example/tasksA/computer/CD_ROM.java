package org.example.tasksA.computer;

public class CD_ROM extends Device {
    private String dimension;
    private int speedOfReading;

    public CD_ROM () {

    }

    public CD_ROM (String type, int speedOfReading) {
        this.type = type;
        this.speedOfReading = speedOfReading;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int getSpeedOfReading() {
        return speedOfReading;
    }

    public void setSpeedOfReading(int speedOfReading) {
        this.speedOfReading = speedOfReading;
    }
}
