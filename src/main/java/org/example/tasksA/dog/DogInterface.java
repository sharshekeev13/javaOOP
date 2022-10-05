package org.example.tasksA.dog;

public interface DogInterface {

    default void makeJump() {
        System.out.println("I'm jumping");
    }

    default void makeVoice() {
        System.out.println("Bow-wow !");
    }

    default void makeRun() {
        System.out.println("Running around...");
    }

    default void makeBite() {
        System.out.println("Clunk...");
    }

}
