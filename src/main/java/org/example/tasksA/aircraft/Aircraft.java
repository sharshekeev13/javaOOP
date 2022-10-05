package org.example.tasksA.aircraft;

public class Aircraft {
    private Engine engine = null;
    private Chassis chassis = null;
    private Wing wing = null;
    private String name;

    public Aircraft(String name) {
        this.name = name;
    }

    public void setWing(Wing wing){
        this.wing = wing;
    }

    public void setChassis(Chassis chassis){
        this.chassis = chassis;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public String getInfo(){
        return this.getInfo() +
                this.engine.getInfo() +
                this.chassis.getInfo() +
                this.wing.getInfo();
    }
}




