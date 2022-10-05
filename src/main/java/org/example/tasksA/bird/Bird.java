package org.example.tasksA.bird;

public class Bird implements BirdInterface {
    private Wings wings;
    private String name;
    private Beak beak;

    public Bird(String name) {
        this.name = name;
        this.wings = new Wings();
        this.beak = new Beak();
    }

    public void fly() {
        System.out.print("Bird " + name + " is flying");
        wings.use();
    }

    public void eat() {
        System.out.println("Bird " + name + " is eating");
    }

    public void attack(){
        System.out.println("Bird " + name + " is attacking");
        beak.attack();
    }

    public void sitDown(){
        System.out.println("Bird " + name + " is sitting down");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bird bird = (Bird) o;

        if (!wings.equals(bird.wings)) return false;
        return name.equals(bird.name);

    }

    @Override
    public int hashCode() {
        int result = wings.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Bird : '" + name + "'";
    }
}
