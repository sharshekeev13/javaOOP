package org.example.tasksA.aircraft;

public interface AircraftInterface {
    default void setWing(Wing wing){}

    default void setChassis(Chassis chassis){}

    default void setEngine(Engine engine){}

    default String getInfo(){
        return "";
    }
}
