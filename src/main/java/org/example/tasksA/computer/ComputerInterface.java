package org.example.tasksA.computer;

public interface ComputerInterface {

    default void switchOn () {
        System.out.println("Hello, my dear admin!");
    }

    default void switchOff () {
        System.out.println("Good night...");
    }

    default void virusTest () {}

}
