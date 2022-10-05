package org.example.tasksA.computer;

public class RAM extends Device {
    private int frequency;
    private String latency;

    public RAM () {

    }

    public RAM (String capacity, int frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }
}
