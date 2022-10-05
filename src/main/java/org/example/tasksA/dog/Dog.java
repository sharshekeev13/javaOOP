package org.example.tasksA.dog;

public class Dog extends Animal implements DogInterface {
    public Dog(String name) {
        super(name);
    }

    public void makeJump() {
        System.out.println("I'm jumping");
    }

    public void makeVoice() {
        System.out.println("Bow-wow !");
    }

    public void makeRun() {
        System.out.println("Running around...");
    }

    public void makeBite() {
        System.out.println("Clunk...");
    }
}
